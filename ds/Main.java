import java.util.*;
import javax.sound.sampled.*;
import java.util.List;
import java.io.*;
public class Main  {


	public static void main(String[] args)throws  Exception {


		Caesar C= new Caesar();
		RailFence R= new RailFence();
		Case Ca= new Case();
		Create Cr= new Create();
		Delete D= new Delete();
		Export E= new Export();
		WriteRead WR = new WriteRead();
		if(args.length == 0 || args.length > 4 || args.length<2){

			System.out.println("\n\t\tProgrami pranon deri në 4 argumente!\n");
			System.out.println("\t\t\tPërdorimi i Programit\n\n1.Për Kodin Caesar shtyp -> Caesar encrypt | decrypt <teksti> <celësi>\n" + "~Për BruteForce shtyp -> Caesar bruteforce <teksti>\n"+ "2.Për Kodin RailFence shtyp -> RailFence encrypt | decrypt <teksti> <celësi>\n" + "3.Për Kodin Case shtyp -> Case lower | upper | inverse | alternating | capitalize <teksti>\n"+"4.Per te krijuar user shtyp -> create-user <emri>\n"+"5.Per te fshire user shtyp -> delete-user <emri>");
			System.exit(1);
		}

		if("write-message".equals(args[0])) 
		       System.out.println(WR.encrypt(args[1],args[2])); 
        if("read-message".equals(args[0])) 
	           System.out.println(WR.decrypt(args[1],args[2]));
		
        if(args.length > 3) {


			String text = args[2];
			String key = args[3];
			int k = Integer.parseInt(key);
			

			if ("Caesar".equals(args[0])) {
				if ("encrypt".equals(args[1])) {

					if (text.matches("^[a-zA-Z0-9 ]+"))
						System.out.println(C.encoding(text, k));
					else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				} else if ("decrypt".equals(args[1]))
					C.decoding(text, k);
				else if ("bruteforce".equals(args[1])) {
					if (text.matches("^[a-zA-Z0-9 ]+"))
						C.bruteforce(text);
					else {
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
						System.exit(1);
					}
				}
			}

			if ("RailFence".equals(args[0])) {
				if ("encrypt".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+"))
						R.encoding(text, k);
					else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				} else if ("decrypt".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+")) {
						R.decoding(text, k);
					} else {
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja");
						System.exit(1);
					}
				}
			}


			if ("Case".equals(args[0])) {
				if ("lower".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+"))
						Ca.lower(text);
					else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				} else if ("upper".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+")) {
						Ca.upper(text);
					} else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				} else if ("capitalize".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+")) {
						Ca.capitalize(text);
					} else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				} else if ("alternating".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+")) {
						Ca.alternating(text);
					} else {
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
					}
				} else if ("inverse".equals(args[1])) {
					if (text.matches("^[a-zA-Z ]+")) {
						Ca.inverse(text);
					} else {
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
						System.exit(1);
					}
				}
			}

		}
		
        
			if ("export-key".equals(args[0])) {
				String text = args[2];
				if ("public".equals(args[1]))

					if (text.matches("^[a-zA-Z ]+")) {
						E.publicKey(text);

					} else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
			}
		





	    else {
		String text1=args[1];
		if("create-user".equals(args[0]))
			{
				if(text1.matches("^[a-zA-Z0-9 ]+"))
					try {
						Cr.CreateUser(text1);
					} catch (Exception e) {

						e.printStackTrace();
					}
				else
					System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
			}
		 else if("delete-user".equals(args[0])){
				{
					if(text1.matches("^[a-zA-Z0-9 ]+"))
						try {
							D.DeleteUser(text1);
						} catch (Exception e) {

							e.printStackTrace();
						}
					else
						System.out.println("\n\t\tTeksti duhet të përmbajë vetëm shkronja!\n");
				}
			}
	    }
	}
}

