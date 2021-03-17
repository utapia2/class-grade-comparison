public class UnderGraduate_HW8 extends Student_HW8 implements CompareStudents_HW8<UnderGraduate_HW8> { 
   
  private String classification; 
   
  // Constructor 
  UnderGraduate_HW8(String name, String major, String classification) throws InvalidClassificationException_HW8
  { 
    super(name, major);  
    if(!classification.equals("Freshman") && !classification.equals("Sophomore") && 
       !classification.equals("Junior") && !classification.equals("Senior")){
      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Freshman, Sophomore, Junior, or Senior.");
    }
    
    else
      this.classification = classification;
  } 
   
  // Set classification 
  public void setClassification(String classification) throws InvalidClassificationException_HW8
  { 
    if(!classification.equals("Freshman") && !classification.equals("Sophomore") && 
       !classification.equals("Junior") && !classification.equals("Senior")){
      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Freshman, Sophomore, Junior, or Senior.");
    }
      this.classification = classification;
  } 
   
  // Get classification 
  public String getClassification() 
  { 
    return this.classification; 
  } 
   
  // Compare 
  public UnderGraduate_HW8 compare(UnderGraduate_HW8 ug) throws InvalidClassificationException_HW8
  { 
    if(!classification.equals("Freshman") && !classification.equals("Sophomore") && 
       !classification.equals("Junior") && !classification.equals("Senior")){
      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Freshman, Sophomore, Junior, or Senior.");
    }
    if(ug.getClassification().equals("Freshman"))
    {
      return this;
    }
    else if(this.getClassification().equals("Junior") && !ug.getClassification().equals("Senior"))
    {
      return this;
    }
    else if(this.getClassification().equals("Senior"))
    {
      return this;
    }
    else
    {
      return ug;
    }
  } 
   
} // End class