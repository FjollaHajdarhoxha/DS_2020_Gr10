import javax.crypto.Cipher;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class WriteRead {

   

    public static String encrypt(String plainText, String filename) throws Exception {
    	
        

        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse("C:\\Users\\DigitalComputers\\Desktop\\fjolla\\keys\\"+filename+".pub.xml");
		
		NodeList list=document.getElementsByTagName("RSAKeyValue");
		for (int i=0; i<list.getLength();i++) {
			Node node = list.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element) node;
				System.out.println("<RSAKeyValue>");
				System.out.println("/n<Modulus>"+element.getElementsByTagName("Modulus").item(0).getTextContent()+"</Modulus>");
				System.out.println("/n<Exponentent>"+element.getElementsByTagName("Exponent").item(0).getTextContent());
                System.out.println("/n</RSAKeyValue>");
			}
		}
                byte[] clean = plainText.getBytes();
                String key = document.getElementsByTagName("RSAKeyValue").item(0).getTextContent();
		     
        int ivSize = 16;
        byte[] iv = new byte[ivSize];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

       
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(key.getBytes("UTF-8"));
        byte[] keyBytes = new byte[16];
        System.arraycopy(digest.digest(), 0, keyBytes, 0, keyBytes.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

        
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(clean);

       
        byte[] encryptedIVAndText = new byte[ivSize + encrypted.length];
        System.arraycopy(iv, 0, encryptedIVAndText, 0, ivSize);
        System.arraycopy(encrypted, 0, encryptedIVAndText, ivSize, encrypted.length);
		String encryptedtext = Base64.getEncoder().encodeToString(encryptedIVAndText);
		System.out.println("Teksti i enkriptuar: " );
		return encryptedtext;
		
    }
        
    public static String decrypt(String encryptedtext, String filename) throws Exception {
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse("C:\\Users\\DigitalComputers\\Desktop\\fjolla\\keys\\"+filename+".pub.xml");
		
		NodeList list=document.getElementsByTagName("RSAKeyValue");
		for (int i=0; i<list.getLength();i++) {
			Node node = list.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element) node;
				System.out.println("<RSAKeyValue>");
				System.out.println("/n<Modulus>"+element.getElementsByTagName("Modulus").item(0).getTextContent()+"</Modulus>");
				System.out.println("/n<Exponentent>"+element.getElementsByTagName("Exponent").item(0).getTextContent());
                System.out.println("/n</RSAKeyValue>");
			}
		}
		String key = document.getElementsByTagName("RSAKeyValue").item(0).getTextContent();
        int ivSize = 16;
        int keySize = 16;
        byte[] encryptedIvTextBytes = Base64.getDecoder().decode(encryptedtext);
        
        byte[] iv = new byte[ivSize];
        System.arraycopy(encryptedIvTextBytes, 0, iv, 0, iv.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        
        int encryptedSize = encryptedIvTextBytes.length - ivSize;
        byte[] encryptedBytes = new byte[encryptedSize];
        System.arraycopy(encryptedIvTextBytes, ivSize, encryptedBytes, 0, encryptedSize);

        
        byte[] keyBytes = new byte[keySize];
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(key.getBytes());
        System.arraycopy(md.digest(), 0, keyBytes, 0, keyBytes.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

  
        Cipher cipherDecrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] decrypted = cipherDecrypt.doFinal(encryptedBytes);
        
        System.out.println("Teksti i dekriptuar:");
        
        return new String(decrypted);
        
    

    }
}
