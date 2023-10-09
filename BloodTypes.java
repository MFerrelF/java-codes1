package codes;
import java.util.Scanner;
public class BloodTypes {
	public static void main(String[] args){
        Scanner kb = new Scanner(System.in); //Scanner enabled;     
        
        System.out.println("Please, input your blood type: "); //Target asked to Input bloodtype;
        String bloodtype = kb.nextLine(); //Determine that the first input will be a string variable " bloodtype ";
        
        System.out.println("");
       
        //Creating an group of String variables in order to compare it to the Targets input (bloodtype);
        String aPositivo = "A+";
        String oPositvo = "O+";
        String bPositvo = "B+";
        String abPositvo = "AB+";
        String aNegativo = "A-";
        String oNegativo = "O-";
        String bNegativo = "B-";
        String abNegativo = "AB-";
        
        //Comparing the strings using the " .intern() ". Until the Target does not input a real bloodtype value, the while condition will be true so the loop happens;
        while ( aPositivo != bloodtype.intern() && oPositvo != bloodtype.intern() && bPositvo != bloodtype.intern() && abPositvo != bloodtype.intern() && aNegativo != bloodtype.intern() 
        && oNegativo != bloodtype.intern() && bNegativo != bloodtype.intern() && abNegativo != bloodtype.intern()){
            System.out.println("Invalid blood type!!! Please, input your correct blood type: ");//New question displayed in order to highlight to the target that a correct...
            bloodtype = kb.nextLine();                                                          //... blood type has to be inputed;
            
            System.out.println(" ");
            
        }
        
               
        System.out.println("Do you want to know about giving or receiving blood?"); //Asking if Target wants to get information about giving or receiving;
        
        System.out.println(" ");
       
        System.out.println("1- Giving."); // Options detailed;
        System.out.println("2- Receiving.");        
        int choice = kb.nextInt();// Determine that the input will be an Integer variable " choice " and will be used as a switch;
       
        System.out.println(" ");
       
        //Only two options (1 or 2) avaiable as authorized answers, if the target input a different value the while condition will be true so the loop happens; 
      while (choice != 1 && choice != 2){
            System.out.println("Incorrect input!!! Please, choose between 1 for Giving or 2 for Receiving: ");//New question displayed in order to highlight to the target...
            choice = kb.nextInt();                                                                            //...that the correct option among the possibilities has to be chosen;
            
            System.out.println(" ");            
        }
        //Switch + if to determine the correct output for each " type of blood x Giving or Receiving " (Case 1 = Giving blood, Case 2 = Receiving blood);        
        switch (choice){
            case 1:
                if (bloodtype.equalsIgnoreCase ("A+")){
                   System.out.println("Blood types supported: A+ or AB+."); 
                }
                else if (bloodtype.equalsIgnoreCase ("O+")){
                    System.out.println("Blood types supported: O+, A+, B+ or AB+.");
                }
                else if (bloodtype.equalsIgnoreCase ("B+")){
                    System.out.println("Blood types supported: B+ or AB+.");
                }
                else if (bloodtype.equalsIgnoreCase ("AB+")){
                    System.out.println("Blood types supported: AB+.");
                }
                else if (bloodtype.equalsIgnoreCase ("A-")){
                    System.out.println("Blood types supported: A+, A-, AB+ or AB-.");
                }
                else if (bloodtype.equalsIgnoreCase ("O-")){
                    System.out.println("Blood types supported: All types of blood supported.");
                }
                else if (bloodtype.equalsIgnoreCase ("B-")){
                    System.out.println("Blood types supported: B+, B-, AB+ or AB-.");
                }
                else if (bloodtype.equalsIgnoreCase ("AB-")){
                    System.out.println("Blood types supported: AB+ or AB-.");
                }
                break;
            case 2: 
                if (bloodtype.equalsIgnoreCase ("A+")){
                   System.out.println("Blood types supported: A+, A-, O+ or 0-."); 
                }
                else if (bloodtype.equalsIgnoreCase ("O+")){
                    System.out.println("Blood types supported: O+ or O-.");
                }
                else if (bloodtype.equalsIgnoreCase ("B+")){
                    System.out.println("Blood types supported: B+, B-, O+ or O-.");
                }
                else if (bloodtype.equalsIgnoreCase ("AB+")){
                    System.out.println("Blood types supported: All types of blood supported.");
                }
                else if (bloodtype.equalsIgnoreCase ("A-")){
                    System.out.println("Blood types supported: A- or O-.");
                }
                else if (bloodtype.equalsIgnoreCase ("O-")){
                    System.out.println("Blood types supported: O-.");
                }
                else if (bloodtype.equalsIgnoreCase ("B-")){
                    System.out.println("Blood types supported: B- or O-.");
                }
                else if (bloodtype.equalsIgnoreCase ("AB-")){
                    System.out.println("Blood types supported: AB-, A-, B- or O-.");
                }
                break;    
                
                
            }
        }
    }