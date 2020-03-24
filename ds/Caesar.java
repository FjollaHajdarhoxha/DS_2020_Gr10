public class Caesar{
    public static final String alfabeti = "abcdefghijklmnopqrstuvwyxz" ; 
    
public static String encoding (String plaintext, int key)
    {
        plaintext = plaintext.toLowerCase() ;
        String ciphertext = "" ;
       
