
package example.pkg2.sec.pkg6;
import java.util.Scanner;

public class Example2Sec6 {

    
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int value ;
        int sum = 0;
        
        System.out.println("Enter first integer (enter 0 to quit) :");
        value = ref.nextInt();
        
        while(value !=0){
            sum +=value;
            System.out.println("Enter next integer (enter 0 to quit) :");
            value = ref.nextInt();
        }
        System.out.println("Sum of the integers :" + sum);
    }
    
}
