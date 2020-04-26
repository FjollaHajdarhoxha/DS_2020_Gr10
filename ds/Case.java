
public class Case {

	   static String upper(String str)
	   {
		   String strUpper=str.toUpperCase();
		   return strUpper;
	   }
	   static String lower(String str)
	   {
		   String strLower=str.toLowerCase();
		   return strLower;
	   }
	
	   static void inverse (String str) {
	    	
	    	
	        char[] charArray = str.toCharArray();
	      
	        for(int i=0; i < charArray.length; i++){
	            
	            
	            if( Character.isUpperCase(charArray[i]) ){
	                
	                charArray[i] = Character.toLowerCase( charArray[i] );
	                
	            }else if(Character.isLowerCase(charArray[i]) ){
	                
	                charArray[i] = Character.toUpperCase( charArray[i] );
	            }    
	            
	        }
	        
	       
	        str = new String(charArray);
	        
	        System.out.println(str);
	    	
	    	
               }

	static String alternating(String str)
	   {
		   char[] charArray=str.toCharArray();
		   for(int i=0;i<charArray.length;i++)
		   {
			   if(i%2==0)
			   { charArray[i]=Character.toLowerCase(charArray[i]); }
			   else
			   { charArray[i]=Character.toUpperCase(charArray[i]);}
		   }
		   str=new String(charArray);
		   return str;
	   }
	
	   static String capitalize (String str)
	   {
		     char ch[]=str.toCharArray();
		     for(int i=0; i<str.length();i++)
		     {
		    	if(i==0 && ch[i] != ' ' || ch[i] !=' ' && ch[i-1]==' '	)
		    	{
		    		if(ch[i]>= 'a'&& ch[i]<='z')
		    		
		    			{ch[i]=(char)(ch[i]-'a'+'A');}
		    	}
		    	else if (ch[i]>='A' && ch[i]<='Z')
		    	    ch[i]=(char)(ch[i]+'a'-'A');
		     }
		     String st=new String(ch);
		     return st;
		   }
	    
	   
	   
	

}
