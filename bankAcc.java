package codes;
import java.util.Scanner;

public class bankAcc {
	// 1- ask user to input bank balance;
    // 2- display the menu: 1- Deposit: -input amount -calculate new balance -print balance 2- Withdraw - input amount - calculate - print 3- Display Balance;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        double bankBalance;
        System.out.print("Insert your bank balance: $");
        bankBalance = kb.nextDouble();        
        
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("Choose your statement(1-3): ");
        
        int choice = kb.nextInt();      
        
        switch (choice) {
            case 1:
                System.out.print("Input the amount deposited: $");
                double valueDeposited = kb.nextDouble();
                bankBalance+=valueDeposited;//the symbols "+=" indicates that the deposited value will be added to the bank Balance;
                System.out.format("Your new balance is: $ %.2f", +bankBalance);
                break;
            
            case 2:
                System.out.print("Input the amount withdrawn: $");
                double valueWith = kb.nextDouble();
                bankBalance-=valueWith;//the symbols "-=" indicates that the withdraw will be subtracted to the bank Balance;
                System.out.format("Your new balance is: $ %.2f", +bankBalance);
                break;
                
            case 3:
                System.out.format("Your balance is: $ %.2f", +bankBalance);
                break;
                
            default:
                System.out.println("Illegal Operator");
        }
        
    }
    
}
