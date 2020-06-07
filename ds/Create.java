static void pass(String emri) throws Exception {
	 String name= emri; 
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Ju lutem jepni fjalekalimin:"); String
	  fjalekalimi=sc.next();
	 
	  if(fjalekalimi.length()> 7) { 
		  if(checkString(fjalekalimi)) {
	         System.out.println("Perserit fjalekalimin:"); 
	         String fjalekalimi1=sc.next();
	  if(fjalekalimi.equals(fjalekalimi1)) { 
		  String algorithm = "MD5";
		  byte[] salt = createSalt();
		  String pasi=generateHash(fjalekalimi, algorithm, salt);
		  System.out.println(pasi);
		  System.out.println(salt);
		  System.out.println("Eshte krijuar shfrytezuesi '"+name+"'");
		  CreateUser(name); 
		  
	  
	  
	  }
	  else {
		  System.out.println("Gabim: Fjalekalimet nuk perputhen.");
	  }
	 
	  } else { 
		  System.out.println("Gabim: Fjalekalimi duhet te permbaje se paku nje numer ose simbol."); 
		  } 
		  } else {
			  
	  System.out.println("Fjalekalimi eduhet te kete me shume se 6 karaktere!"); 
	  }
	  }
