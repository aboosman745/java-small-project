
package task3.sec6.palindrome;

import java.util.Scanner;

public class Task3Sec6Palindrome {

    
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        int number = ref.nextInt();
        
        int original = number;
        int reversed = 0;
        
        while(number !=0){
             int digit = number%10;
             reversed = reversed * 10 + digit;
             number /= 10;
              
        }
         
        if(original==reversed){
            System.out.println("The Number is Palindrome");
        }else{
            System.out.println("The Number is Not Palindrome");
        }
            
                
     
        
    }
    
}
