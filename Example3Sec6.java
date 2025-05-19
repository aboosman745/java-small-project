
package example.pkg3.sec.pkg6;
import java.util.Scanner;

public class Example3Sec6 {

    
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int number1 , number2;
        char choice;
        
        do{
            System.out.println("Enter the first number ");
            number1 = ref .nextInt();
            
            System.out.println("Enter the second number");
            number2 = ref.nextInt();
            
            int sum = number1 + number2;
            System.out.println("Sum of numbers : " + sum);
            
            System.out.println("Do you want to continue y/n?");
            choice = ref .next().charAt(0);
            
        }while(choice=='y' || choice=='b' || choice=='a');
        
        }
    
}
