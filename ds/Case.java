import java.util.Scanner;
public class test1 {

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
	
	   static void inverse (StringBuffer str)
	   {
		   int ln=str.length();
		   for(int i=0; i<ln; i++)
		   {
			   Character c= str.charAt(i);
			   if(Character.isLowerCase(c))
				   str.replace(i,i+1,Character.toUpperCase(c)+" ");
			   else 
				   str.replace(i,i+1,Character.toLowerCase(c)+" ");
			
			 }
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
	    
	   
	   
	public static void main(String[] args)
	{ 
		
		 if("upper".equals(args[0]))
		       System.out.println(upper(args[1]));
		    if("lower".equals(args[0]))
		        System.out.println(lower(args[1]));
		    if("inverse".equals(args[0]))
			       inverse(args[1]);
			    if("alternating".equals(args[0]))
			        System.out.println(alternating(args[1]));
			    if("capitalize".equals(args[0]))
				       System.out.println(capitalize(args[1]));
				  


	}

}
