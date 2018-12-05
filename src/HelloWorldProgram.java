import java.io.*; 
public class HelloWorldProgram {
  /** Print a hello message */ 
  public static void main(String[] args) { 
    BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in)); 
    String name = "Instructor"; 
    String city ="Bangalore";
    System.out.print("Give your name: "); 
    System.out.print("Give your City Name: "); 
    try {name = in.readLine();}
        catch(Exception e) {
           System.out.println("Caught an exception!"); 
        }
    try {city = in.readLine();}
    catch(Exception e) {
       System.out.println("Caught an exception!"); 
    }
    System.out.println("Hello " + name + "!"); 
    System.out.println("from " + city + "!"); 
  }
}
