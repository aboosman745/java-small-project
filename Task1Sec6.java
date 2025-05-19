
package task1.sec6;
import java.util.Scanner;

public class Task1Sec6 {

    
    public static void main(String[] args) {
    Scanner ref = new Scanner(System.in);
    
        System.out.println("please enter a 3-digit number : ");
        int number = ref.nextInt();
        
        int originalNumber = number;
        int result = 0;
        
        while(number !=0){
            int digit = number % 10;
            result += digit * digit * digit ;
            number /=10;
        }
        
        if (result == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number.");
            
        }else{
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
    
}
