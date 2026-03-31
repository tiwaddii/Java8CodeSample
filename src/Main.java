import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	 List<String> skillList = new ArrayList<>();
         skillList.add("Java");
         skillList.add("Spring");
         
    	 Immutable user = new Immutable("John", "john@gmail.com", skillList);

         System.out.println("UserName: " + user.getFullName());
         System.out.println("Email: " + user.getEmailId());
         System.out.println("Skills: " + user.getSkills());

         // Try modifying returned list
         System.out.println("\nTrying to modify skills list...");
         try {
        	 user.getSkills().add("Python"); // This will throw UnsupportedOperationException
         } catch (UnsupportedOperationException e) {
             System.out.println("Modification not allowed! Immutable object maintained.");
         }

         // Verify original object is unchanged
         System.out.println("Final Skills: " + user.getSkills());
     }
    
}