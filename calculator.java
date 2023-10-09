package codes;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		
		System.out.println("Enter the operator (1-4): ");
		int choice = kb.nextInt();
		
		System.out.println("Enter the two Operands: ");
		double num1 = kb.nextDouble();
		double num2 = kb.nextDouble();
		
		double answer = 0.0;
		
		switch(choice) {
			case 1:
				answer = num1 + num2;
				System.out.println(num1+" + "+num2+" = "+answer);
				break;
			case 2:
				answer = num1 - num2;
				System.out.println(num1+" - "+num2+" = "+answer);
				break;
			case 3:
				answer = num1 * num2;
				System.out.println(num1+" * "+num2+" = "+answer);
				break;
			case 4:
				answer = num1 / num2;
				System.out.println(num1+" / "+num2+" = "+answer);
				break;
			default: 
				System.out.println("Illegal Operator.");
		}

	}

}
