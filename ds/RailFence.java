public class RailFence {

	public static void main(String[] args) {
		if("encrypt".equals(args[0]))
		       System.out.println(encoding(args[1],Integer.parseInt(args[2])));
       
	}
	public static String encoding(String plaintext, int key) {
	  String ciphertext = "" ;
	  boolean kontrollo=false;
	  int j=0;
	  int rreshta=key;
	  int kolona=plaintext.length();
	  
	  char[][] a= new char [rreshta][kolona];
	  
	  for(int i=0; i< kolona; i++) {
		  if(j ==0 || j== key-1)    
			  kontrollo = !kontrollo;
		  
		  a[j][i]= plaintext.charAt(i);
		  
		  
		 if(kontrollo)
			 j++;
		 else
			 j=0;
	  }
