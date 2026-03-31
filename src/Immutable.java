//Immutable classes in Java and How do we implement one

import java.util.*;

public final class Immutable {
   
   private final String fullName;
   private final String emailId;
   private final List<String> skills;
   
   public Immutable(String fullName, String emailId, List<String> skills) {
       this.fullName = fullName;
       this.emailId = emailId;
       this.skills = new ArrayList<>(skills);
   }

   public String getFullName() {
      return fullName;
   }
   
   public String getEmailId() {
      return emailId;
   }   
    
   public List<String> getSkills() {
      return Collections.unmodifiableList(skills);
   }
}