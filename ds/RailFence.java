
public class RailFence {

	public static void main(String[] args) {
		if(args.length == 0)
	     	System.out.println("Ju lutem jep njerin nga argumentet:"+"\n"+" encrypt" +"\n"
	                           +" decrypt" +"\n"+
	      "Shtyp 1 per te ndalur programin");
	    if("1".equals(args[0]))
	    	System.exit(1);
		 if("encrypt".equals(args[0]))
		       System.out.println(encoding(args[1],Integer.parseInt(args[2])));
		    if("decrypt".equals(args[0]))
		        System.out.println(decoding(args[1],Integer.parseInt(args[2])));
       
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
	  
	  for(int i=0; i<rreshta;i++) {
		  for(int k=0;k<kolona;k++) {
			  if(a[i][k]!=0)						  
				  ciphertext += a[i][k];
	
		  }
		  }
	
      return ciphertext;
  }
   public static String decoding (String ciphertext, int key) {
	   String deciphertext = "" ;
          boolean kontrollo=false;
          int rreshta=key;
          int j=0;
	  int kolona=ciphertext.length();
	  
	  char[][] a= new char [rreshta][kolona];

 
	  for(int i=0; i< kolona; i++) {
		  if(j ==0 || j== key-1)    
			  kontrollo = !kontrollo;
		  
		   a[j][i]='*';
		  
		  
		 if(kontrollo)
			 j++;
		 else
			 j=0;
	  }

	  int pozita=0;
	  kontrollo=false;
	  for(int i=0; i<rreshta;i++) {
		  for(int k=0;k<kolona;k++) {
			  if(a[i][k]=='*' && pozita < kolona)						  
				  a[i][k]=ciphertext.charAt(pozita++);
		
		  }
		  }
	
	  j=0;
	  for(int i=0; i< kolona; i++) {
		  if(j ==0 || j== key-1)    
			  kontrollo = !kontrollo;
		  
		  deciphertext += a[j][i];
		  
		  
		 if(kontrollo)
			 j++;
		 else
			 j=0;
	  }
	   return deciphertext ;
}
}