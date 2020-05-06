import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Export {
	
	public void publicKey(String filename) throws Exception {
	
		File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".pub.xml");
	   
		
	    if (file.exists()) {
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".pub.xml");
		
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
	    }else
	    	System.out.println("Gabim: Celesi publik '"+filename+"' nuk ekziston.");
	}
   public  void privateKey(String filename) throws Exception {
	
	   File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".xml");
	   
		
	    if (file.exists()) {
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document=documentBuilder.parse("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".xml");
		
		NodeList list=document.getElementsByTagName("RSAKeyValue");
		for (int i=0; i<list.getLength();i++) {
			Node node = list.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element=(Element) node;
				
				System.out.println("<RSAKeyValue>");
				System.out.println("\n<Modulus>"+element.getElementsByTagName("Modulus").item(0).getTextContent()+"</Modulus>");
				System.out.println("\n<Exponentent>"+element.getElementsByTagName("Exponent").item(0).getTextContent());
				System.out.println("\n<P>"+element.getElementsByTagName("P").item(0).getTextContent()+"</P>");
				System.out.println("\n<Q>"+element.getElementsByTagName("Q").item(0).getTextContent()+"</Q>");
				System.out.println("\n<DP>"+element.getElementsByTagName("DP").item(0).getTextContent()+"</DP>");
				System.out.println("\n<InverseQ>"+element.getElementsByTagName("InverseQ").item(0).getTextContent()+"</InverseQ>");
				System.out.println("\n<D>"+element.getElementsByTagName("D").item(0).getTextContent()+"</D>");
                System.out.println("\n</RSAKeyValue>");
			}
		}
          }else
          	System.out.println("Gabim: Celesi privat '"+filename+"' nuk ekziston.");
	}
   public void filepublic(String filename,String file2) {
	   FileInputStream instream = null;
		FileOutputStream outstream = null;
	 
	    	try{
	    	    File infile =new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".pub.xml");
	    	    File outfile =new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+file2+".xml");
	 
	    	    instream = new FileInputStream(infile);
	    	    outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    /*copying the contents from input stream to
	    	     * output stream using read and write methods
	    	     */
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("Celesi publik u ruajt ne fajllin '"+file2+".xml'.");
	 
	    	}catch(IOException ioe){
	    		ioe.printStackTrace();
	    	 }
	    }
   public void fileprivate(String filename,String file2) {
	   FileInputStream instream = null;
		FileOutputStream outstream = null;
	 
	    	try{
	    	    File infile =new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+filename+".xml");
	    	    File outfile =new File("C:\\Users\\admin\\OneDrive\\Desktop\\keys\\"+file2+".xml");
	 
	    	    instream = new FileInputStream(infile);
	    	    outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    /*copying the contents from input stream to
	    	     * output stream using read and write methods
	    	     */
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("Celesi publik u ruajt ne fajllin '"+file2+".xml'.");
	 
	    	}catch(IOException ioe){
	    		ioe.printStackTrace();
	    	 }
	    }
      
   }
	


