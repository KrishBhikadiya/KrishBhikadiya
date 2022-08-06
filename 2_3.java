// Use the Account class created as above to simulate an ATM machine.
// Create 10 accounts with id AC001.....AC010 with initial balance 300₹. The
// system prompts the users to enter an id. If the id is entered incorrectly, ask
// the user to enter a correct id. Once an id is accepted, display menu with
// multiple choices.
// 1. Balance inquiry
// 2. Withdraw money [Maintain minimum balance 300₹]
// 3. Deposit money
// 4. Money Transfer
// 5. Create Account
// 6. Deactivate Account
// 7. Exit
//Prepared by KRISH_21CE012  
import java.util.Scanner;

public class pr_3 {
    static double acb = 300;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new Account(i, 300.0);
        }

        System.out.print("Enter an id (1 - 10): ");
        int id = in.nextInt();
        if (id < 1 || id > 10) {
            System.out.println("enter a correct id,written id is incorrect");
        }

        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = in.nextInt();
            Account a=new Account();
         switch(choice)
         {
            case 1:
            // a.balanceinquiry();
            break;
            case 2:
            a.withdraw();
            break;
            case 3:
            a.deposit();
            break;
            case 4:
            // a.transfer();
            break;
            case 5:
            // a.create_account();
            break;
            case 6:
            // a.Deactivate_Account();
            break;
            case 7:
            break;
            default:
            break;
        
         }
        }
    }
    public static void menuDisplay() {
       
        System.out.println("****Main menu****");
        System.out.println("1: Balance Inqury");
        System.out.println("2: Withdraw money");
        System.out.println("3: Deposit money");
        System.out.println("4: Transfer");
        System.out.println("5: Create account");
        System.out.println("6: deactivate Account");
        System.out.println("7: Exit");
       
    }
}
