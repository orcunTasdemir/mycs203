/**
 * Write a description of class GreeterApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreeterApp
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class GreeterApp
     */
    public GreeterApp()
    {

    }

    public static void main(){
           
        Greeter greetObj1 = new Greeter("Orcun");
        Greeter greetObj2 =  greetObj1;
        
        System.out.println("Set name for obj1 to Orcun");
        greetObj1.setName("Orcun");   
        System.out.println("name set: " + greetObj1.getName());
        System.out.println("Second variable for the same object calls sayHello on the name");
        greetObj2.sayHello();
        
        ////////////////////////Second part/////////////////////
        Greeter greetObj3 = new Greeter("FirstName");
        Greeter greetObj4 =  new Greeter("SecondName");
        System.out.println("Setting names as firstName and secondName for the two objects respectively");
        greetObj3.setName("FirstName");
        greetObj4.setName("SecondName"); 
        
        System.out.println("Swapping names...");
        greetObj3.swapNames(greetObj4);
        
        System.out.println("First object's name is now second's: " + greetObj3.getName());
        System.out.println("Second object's name is now first's: " + greetObj4.getName());

        
        

    }

}
