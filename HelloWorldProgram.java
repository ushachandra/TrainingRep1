import java.io.*; 
class HelloWorldProgram {
  /** Print a hello message */ 
  public static void main(String[] args) { 
    BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in)); 
    String name = "Instructor"; 
    String qualification ="B.E";
    System.out.print("Give your name: "); 
    System.out.print("Give your Qualification: ");
    try {name = in.readLine();}
        catch(Exception e) {
           System.out.println("Caught an exception!"); 
        }
     try {qualification = in.readLine();}
        catch(Exception e) {
           System.out.println("Caught an exception!"); 
        }
    
    // add for loop
    For (int i = 0 ; i < 15 ; ++i) {
    System.out.println("Hello " + name + "!" + " welcome to GitHub Training" );
    System.out.println("Qualification:"+qualification);
    }
    
    //add extra print stats
    System.out.println("This is Day 4 of Git Hub Training" ); 
    System.out.println("You will learn the diff between fetch and pull" ); 
    System.out.println("You will learn the concept of cherry pick, stash and to resolve conflicts" ); 
    
  }
}
