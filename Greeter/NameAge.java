import java.util.Scanner; //Scanner class import

public class NameAge
{
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in); //scanner object

        String yourName = scan.nextLine();  

        System.out.println("Hello " + yourName);

        System.out.println("How old are you?");
        String age = scan.nextLine();
        System.out.println("You are " + age + " years old!");

    }
}