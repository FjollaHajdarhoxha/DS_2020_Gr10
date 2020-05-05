import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Delete {
	 public static void DeleteUser (String Name) throws IOException {
	    	
		 try {
		 Files.deleteIfExists(Paths.get("C:\\Users\\DigitalComputers\\Desktop\\fjolla\\keys\\"+Name+".xml")); 
		 Files.deleteIfExists(Paths.get("C:\\Users\\DigitalComputers\\Desktop\\fjolla\\keys\\"+Name+"pub.xml"));
	     }
		 catch(NoSuchFileException e){
			 System.out.println("Gabim: Celesi '"+Name+"' nuk ekziston."); 
			 
		 }
	        catch(IOException e) 
	        { 
	            System.out.println("Invalid permissions."); 
	        } 
	          
	        System.out.println("Deletion successful."); 
	    } 
}
