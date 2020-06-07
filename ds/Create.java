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
private static boolean checkString(String input) {
	    String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	    char currentCharacter;
	    boolean numberPresent = false;
	    boolean upperCasePresent = false;
	    boolean lowerCasePresent = false;
	    boolean specialCharacterPresent = false;
	 
	    for (int i = 0; i < input.length(); i++) {
	        currentCharacter = input.charAt(i);
	        if (Character.isDigit(currentCharacter)) {
	            numberPresent = true;
	        } else if (Character.isUpperCase(currentCharacter)) {
	            upperCasePresent = true;
	        } else if (Character.isLowerCase(currentCharacter)) {
	            lowerCasePresent = true;
	        } else if (specialChars.contains(String.valueOf(currentCharacter))) {
	            specialCharacterPresent = true;
	        }
	    }
	 
	    return
	      numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent;
	}
private static String generateHash(String data, String algorithm, byte[] salt) throws NoSuchAlgorithmException{
	  MessageDigest digest =MessageDigest.getInstance(algorithm);
	  digest.reset();
	  digest.update(salt);
	  byte[] hash= digest.digest(data.getBytes());
	  return bytesToStringHex(hash);
   }
