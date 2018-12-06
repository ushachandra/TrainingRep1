import java.io.*; 
class HelloWorldProgram {
  /** Print a hello message */ 
  public static void main(String[] args) { 
    BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in)); 
    String name = "Instructor"; 
    System.out.print("Give your name: "); 
    try {name = in.readLine();}
        catch(Exception e) {
           System.out.println("Caught an exception!"); 
        }
    
    // add for loop
    For (int i = 0 ; i < 5 ; ++i) {
    System.out.println("Hello " + name + "!" + " welcome to GitHub Training" ); 
     System.out.println("Apply cherry pick chnages" );  
     
    }
    
  }
}
