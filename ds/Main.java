import java.util.*;
import javax.sound.sampled.*;
import java.util.List;
import java.io.*;
public class Main  {

	
	public static void main(String[] args)throws  ArrayIndexOutOfBoundsException, IOException, LineUnavailableException, InterruptedException {
 
	   
	   Caesar C= new Caesar();
	   RailFence R= new RailFence();
	   Case Ca= new Case();	    
	    if(args.length == 0 || args.length > 4 || args.length < 3){
	    	
	    	System.out.println("\n\t\tProgrami pranon deri n� 4 argumente!\n");
	    	 System.out.println("\t\t\tP�rdorimi i Programit\n\n1.P�r Kodin Caesar shtyp -> Caesar encrypt | decrypt <teksti> <cel�si>\n" + "~P�r BruteForce shtyp -> Caesar bruteforce <teksti>\n"+ "2.P�r Kodin RailFence shtyp -> RailFence encrypt | decrypt <teksti> <cel�si>\n" + "3.P�r Kodin Case shtyp -> Case lower | upper | inverse | alternating | capitalize <teksti>");
				System.exit(1);
			}
	    
	    String text = args[2];
	    String key=args[3];
	    int k=Integer.parseInt(key);
	    
	    if("Caesar".equals(args[0])){
			if("encrypt".equals(args[1])){
				if(text.matches("^[a-zA-Z0-9 ]+"))
						System.out.println(C.encoding(text,k));
				else
						System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");
				}
			else if("decrypt".equals(args[1]))
						C.decoding(text,k);
			else if("bruteforce".equals(args[1])) 
					if(text.matches("^[a-zA-Z0-9 ]+"))
						  C.bruteforce(text);
					 else {
						System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");
			            System.exit(1);}
	    }
	    	
	    if("RailFence".equals(args[0])){
			if("encrypt".equals(args[1])){
				if(text.matches("^[a-zA-Z ]+"))
						R.encoding(text,k);
				else 
					System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");
			}
			else if("decrypt".equals(args[1]))
				if(text.matches("^[a-zA-Z ]+")){
					R.decoding(text,k);
				}
				else
					{System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja");
			        System.exit(1);}
			if("Case".equals(args[0])){
				if("lower".equals(args[1])){
					if(text.matches("^[a-zA-Z ]+"))
							Ca.lower(text);
					else 
						System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");
				}
				else if("upper".equals(args[1]))
					if(text.matches("^[a-zA-Z ]+")){
						Ca.upper(text);
					}
					else
						System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");	
				    }
			   else if("capitalize".equals(args[1]))
				   if(text.matches("^[a-zA-Z ]+")){
						Ca.capitalize(text);
					}
					else
						System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");	
				    }
	           else if("alternating".equals(args[1]))
			           if(text.matches("^[a-zA-Z ]+")){
					       Ca.alternating(text);
				     }
				       else {
					   System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");	
			         }
	            else if("inverse".equals(args[1]))
		             if(text.matches("^[a-zA-Z ]+")){
				        Ca.inverse(text);
			     }
			         else {
				        System.out.println("\n\t\tTeksti duhet t� p�rmbaj� vet�m shkronja!\n");	
				        System.exit(1);
		    } 
	    
	    
	    
	    
			
	}
	
}
	    
