import org.joda.time.LocalTime;	               
        
public class HelloWorld {	        
        
  public static void main(String[] args) {	        
        
    LocalTime currentTime = newLocalTime();	        
        
    System.out.println("The current local time is: " + currentTime);	        
        
    	        
        
    Greeter greeter = newGreeter();	        
        
    System.out.println(greeter.sayHello());	        
        
  }	        
        
}
