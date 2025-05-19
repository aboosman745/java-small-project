
package task3.sec4;
import java.util.Scanner;

public class Task3Sec4 {

    
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        
        System.out.println("enter your weight in kilograms: ");
        double weight = ref.nextDouble();
        
        System.out.println("enter your height in meters: ");
        double height = ref.nextDouble();
        //القانون الي هيسخدمه 
        double bmi = weight /(height * height);
        
        System.out.printf("your BMI  is : %2.0f\n",bmi);
        System.out.print("weghit classfication: ");
        
        if (bmi < 18.5 ){
            System.out.println("Underweghit");
        }else if (bmi >=18.5 && bmi <25 ){
            System.out.println("Normal weight");
        }else if (bmi >=25 && bmi <30 ){
            System.out.println("Over weight");
        }else if (bmi >=30 && bmi <35 ){
            System.out.println("Obese");
        }else{
            System.out.println("Severely obese");
            
        }
        
    }
    
}
