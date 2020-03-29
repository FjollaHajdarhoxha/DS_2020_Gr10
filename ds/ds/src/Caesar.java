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
   
	   public static void bruteforce(String plaintext) {
    	    int key = 0;

    	    for (int i = 0; i < 26; i++)
    	    {
    	        
    	    System.out.println("key "+key+":"+ encoding(plaintext,key));
    	    key++;
    	    }
       
           
		
     }
          public static void main (String [] args)
    {
     if(args.length == 0)
     	System.out.println("Ju lutem jep njerin nga argumentet:"+"\n"+" encrypt" +"\n"
                           +" decrypt" +"\n"+" bruteforce"+"\n"+
      "Shtyp 1 per te ndalur programin");
    if("1".equals(args[0]))
    	System.exit(1);
    if("encrypt".equals(args[0]))
       System.out.println(encoding(args[1],Integer.parseInt(args[2])));
    if("decrypt".equals(args[0]))
        System.out.println(decoding(args[1],Integer.parseInt(args[2])));
    if("bruteforce".equals(args[0]))
       bruteforce(args[1]);
    }
   
}
