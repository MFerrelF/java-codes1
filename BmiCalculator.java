package codes;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){
     double weight;
     Scanner kb=new Scanner(System.in);
     
     System.out.print("Please enter your weight: ");     
     weight = kb.nextDouble();
     while (weight <0 || weight > 300){
         System.out.println("Invalid input, please state your weight between 0 and 300 kg: ");
         weight = kb.nextDouble();
     }
     
     double height;
     System.out.print("Please enter your height: ");
     height = kb.nextDouble();
     while (height < 0 || height > 3){
         System.out.println("Invalid input, please state your height between 0 and 3m: ");
         height = kb.nextDouble();
     }
     
     System.out.println("The height and weight: " + height + "m, " + weight + "kg. ");
     
     double bmi = weight / (height * height);    
     //System.out.println("Your BMI is: " + weight / (height * height));
     System.out.format("Your BMI is: %.2f", bmi);
     System.out.println("");
     
     /*if (bmi<18.50){
         System.out.println("You are underweight.");         
     }
     else if (bmi<25){
         System.out.println("You are healthy.");
     }
     else if (bmi<30){
         System.out.println("You are overweight.");
     }
     else if (bmi>=30){
         System.out.println("You are obese.");
     }*/
     
     if (bmi>=30){
         System.out.println("You are obese.");         
     }
     else if (bmi>=25){
         System.out.println("You are overweight.");
     }
     else if (bmi>=18.50){
         System.out.println("You are healthy.");
     }
     else if (bmi<18.50){
         System.out.println("You are underweight.");
     }
     
     
    
     
    
 }
}