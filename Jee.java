import java.util.Scanner;
public class Jee {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our ATM:");

        int PIN = 1234;
        int balance = 1000;

        System.out.println("Enter your PIN:");
        int enteredPIN = sc.nextInt();
    

        if ( enteredPIN != PIN) {
            System.out.println("Invalid PIn:");
            return;
        }
        System.out.println("PIN is accepted:");


        System.out.println("\n1. Check balance:");
        System.out.println("2. Deposit:");
        System.out.println("3.Withdrawal:");
        System.out.println("4.Exit:");



         System.out.println("enter your choice:");
        int choice = sc.nextInt();




        switch (choice) {
            case 1 :
                System.out.println("check your balance:" + balance);
                break;

                case 2:
                    System.out.println("enter deposit amount:");
                    int deposit =  sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your new balance is:" + balance);
                    break;

                    case 3:
                        System.out.println("enter withdrawal amout:");
                        int withdrawal = sc.nextInt();

                        if(withdrawal <= balance) {
                            balance = balance - withdrawal;
                            System.out.println("update balance is:" + balance);
                        } else {
                            System.out.println("Insufficient balance:" + balance);
                            break;
                        }
                            case 4:
                                System.out.println("Invalid choice:");
                                break;
                                default:
                            System.out.println("thanks for using ATM:");

        }



    }
    
}
