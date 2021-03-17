public class InvalidClassificationException_HW8 extends Exception{
  private String message;
  
  InvalidClassificationException_HW8(String message){
    this.message = message;
  }
  
  public String toString(){
    return this.message;
  }
  
  
  
}