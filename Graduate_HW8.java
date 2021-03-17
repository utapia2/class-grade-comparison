public class Graduate_HW8 extends Student_HW8 implements CompareStudents_HW8<Graduate_HW8> 
{ 
   
  private String classification; 
   
  // Constructor 
  Graduate_HW8(String name, String major, String classification) throws InvalidClassificationException_HW8
  { 
    super(name, major); 
    if(!classification.equals("Doctoral") && !classification.equals("Masters")){

      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Doctoral or Masters.");
    }
    
    else
      this.classification = classification; 
  } 
   
  // Set classification 
  public void setClassification(String classification) throws InvalidClassificationException_HW8
  { 
    if(!classification.equals("Doctoral") && !classification.equals("Masters")){

      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Doctoral or Masters.");
    }
    else
      this.classification = classification;
  } 
   
  // Get classification 
  public String getClassification()
  { 
    return this.classification; 
  } 
   
  // Compare 
  public Graduate_HW8 compare(Graduate_HW8 grad) throws InvalidClassificationException_HW8
  { 
    if(!classification.equals("Doctoral") && !classification.equals("Masters")){

      throw new InvalidClassificationException_HW8(classification + " is an invalid classification!" +
                                                   " Must be Doctoral or Masters.");
    }
    if(this.getClassification().equals("Doctoral"))
    {
      return this;
    }
    else
    {
      return grad;
    }
  } 
   
} // End class