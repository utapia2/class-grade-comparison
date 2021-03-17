public abstract class Student_HW8 { 
   
  private String name; 
  private String major; 
   
  // Constructor 
  Student_HW8(String name, String major) { 
    this.name = name; 
    this.major = major; 
  } 
   
  // Get name 
  public String getName() { 
    return this.name; 
  } 
   
  // Get major 
  public String getmajor() { 
    return this.major; 
  } 
   
  // Set classification 
  public abstract void setClassification(String classification)throws InvalidClassificationException_HW8; 
   
  // Get classification 
  public abstract String getClassification(); 
   
} // End class