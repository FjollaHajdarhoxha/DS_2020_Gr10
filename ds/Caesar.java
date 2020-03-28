public class Caesar{
    public static final String alfabeti = "abcdefghijklmnopqrstuvwyxz" ; 
    
public static String encoding (String plaintext, int key)
    {
        plaintext = plaintext.toLowerCase() ;
        String ciphertext = "" ;
        for (int i = 0 ; i < plaintext.length() ; i++)
        {
            int pozita = alfabeti.indexOf(plaintext.charAt(i)) ;             
            int enCh = (key + pozita) % 26 ;
            char ch = alfabeti.charAt(enCh) ;  
            ciphertext += ch ; 
        }
        return ciphertext ;
    }
     public static String decoding (String ciphertext, int key)
    {
        ciphertext = ciphertext.toLowerCase() ;      
        String plaintext = "" ;
         for (int i = 0 ; i < ciphertext.length() ; i++)
        {
            int pozita = alfabeti.indexOf(ciphertext.charAt(i)) ;
            int deCh = (pozita -  key) % 26 ;
            if (deCh < 0) 
            {
                deCh = alfabeti.length() + deCh ;
            }
            char ch = alfabeti.charAt(deCh) ;
            plaintext += ch ;  
        }
        return plaintext ;
    }
    public static String bruteforce(String ciphertext) {
    	ciphertext = ciphertext.toLowerCase() ;
         String decryptedtext = "" ;
         int n;
         for(n=0;n<26;n++) {
        	 
         for(int i=0;i<ciphertext.length();i++)
        	
         {int pozita = alfabeti.indexOf(ciphertext.charAt(i)) ;             
         int enCh = (n + pozita) % 26 ;
         char ch = alfabeti.charAt(enCh) ;
        
         decryptedtext = decryptedtext + ch;
         
       }
         
         }
         
    
		return decryptedtext;
     }
          public static void main (String [] args)
    {
    if("encrypt".equals(args[0]))
       System.out.println(encoding(args[1],Integer.parseInt(args[2])));
    if("decrypt".equals(args[0]))
        System.out.println(decoding(args[1],Integer.parseInt(args[2])));
    }
   
}
