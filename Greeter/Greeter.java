/**
 * Write a description of class Greeter here.
 *
 * @author Orcun Tasdemir
 * @version (a version number or a date)
 */
public class Greeter
{
    private String name; //encapsul

    public Greeter(String name){  
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void swapNames(Greeter greetObj){
        String temp = greetObj.name;
        greetObj.name = this .name;
        this.name = temp;        
    }
    
    public String getName(){
        return name;
    }
    
}
