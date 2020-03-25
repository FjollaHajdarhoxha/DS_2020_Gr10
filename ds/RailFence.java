
public class RailFence {

	public static void main(String[] args) {
		if("encrypt".equals(args[0]))
		       System.out.println(encoding(args[1],Integer.parseInt(args[2])));
              if("dencrypt".equals(args[0]))System.out.println(decoding(args[1],Integer.parseInt(args[2])));
       
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
          int j=0;
	  int kolona=plaintext.length();
	  
	  char[][] a= new char [rreshta][kolona];

 
          for(int i=0;i<rreshta;i++){
                     if(j==0||j==kolona-1)
                      kontrollo=!kontrollo;
  
  
  
                          a[j][i]='*';
                         if(kontrollo)j++;
                           else j=0;
 
 }
 int index=0;
 
 for(int i=0;i<rreshta;i++){
  for(int k=0;k<kolona;k++){
   
   
   if(a[i][k]=='*'&&index<plaintext.length()){
   a[i][k]=plaintext.charAt(index++);
   
   }
   
  }
  
 }
 
 kontrollo=false;
 j=0;
 
 for(int i=0;i<col;i++){
  if( j==0||j==row-1)
   kontrollo=!kontrollo;
  
  
  deciphertext+=a[j][i];
  
 
  if(kontrollo)j++;
  else j=0;
 
 }
 
 

         
          
	   
	   return deciphertext ;
}
}