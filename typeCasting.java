package codes;
import java.util.Scanner;
 
public class typeCasting {

	public static void main(String[] args) {
		int m1,m2,m3,m4;
        Scanner kb=new Scanner(System.in);
        System.out.print("Input the first mark: ");
        m1 = kb.nextInt();
        System.out.print("Input the second mark: ");
        m2 = kb.nextInt();
        System.out.print("Input the third mark: ");
        m3 = kb.nextInt();
        System.out.print("Input the fourth mark: ");
        m4 = kb.nextInt();
        
        double average;
        average = ((double)m1 + m2 + m3 + m4) / 4; //example of typecasting.
        
        System.out.format("The student grade is: %.2f", average);  
        
    }
}