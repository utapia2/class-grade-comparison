public class HW8{
  public static void main (String[] args){
    
    try{
    UnderGraduate_HW8 UG1 = new UnderGraduate_HW8 ("Ulisses Tapia", "Computer Science", "junior");
    UnderGraduate_HW8 UG2 = new UnderGraduate_HW8("John Doe", "Organic Chemistry", "Sophomore");
    
    Graduate_HW8 G1 = new Graduate_HW8("Jane Doe", "Biology", "Masters");
    Graduate_HW8 G2 = new Graduate_HW8("Dr. Strange", "Chemistry", "Doctoral");  
    
    System.out.println("The highest classification is: " + UG1.compare(UG2).getClassification());
    System.out.println("The highest classification is: " + G1.compare(G2).getClassification());
    }
    
    catch(InvalidClassificationException_HW8 ex){
     System.out.println("Message: " + ex.toString()); 
      
    }
    
    try{
    UnderGraduate_HW8 UG1 = new UnderGraduate_HW8 ("Ulisses Tapia", "Computer Science", "Junior");
    UnderGraduate_HW8 UG2 = new UnderGraduate_HW8("John Doe", "Organic Chemistry", "Sophomore");
    
    Graduate_HW8 G1 = new Graduate_HW8("Jane Doe", "Biology", "Masters");
    Graduate_HW8 G2 = new Graduate_HW8("Dr. Strange", "Chemistry", "Doctoral");  
    
    System.out.println("The highest classification is: " + UG1.compare(UG2).getClassification());
    System.out.println("The highest classification is: " + G1.compare(G2).getClassification());
    }
    
    catch(InvalidClassificationException_HW8 ex){
     System.out.println("Message: " + ex.toString()); 
      
    }
    
  }
}