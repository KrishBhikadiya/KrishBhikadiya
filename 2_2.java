// Design a class named Account that contains:
// • A private int data field named id for the account (default 0).
// • A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current
// interest rate (default 7%). Assume all accounts have the same interest rate.
// • A private Date data field named dateCreated that stores the date when the
// account was created.
// • A no-arg constructor that creates a default account.
// • A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
// • A method named getMonthlyInterest() that returns the monthly interest.
// • A method named withdraw that withdraws a specified amount from the account.
// • A method named deposit that deposits a specified amount to the account.
// this.ID = getID();
// public int getID()
// {
//         return 555;
//  
//Prepared by KRISH_21CE012   
import java.util.*;

public class pr_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Account ac=new Account(5,1000);
    for (int i = 2; i > 1; i++) {
      Account a = new Account();
      System.out.println("The Monthly intrest rate is : " + a.getMonthlyInterestRate() + " %");
      System.out.println("The Monthly intrest is : " + a.getMonthlyInterest() + " Rupees ");
      System.out.println("The Yearly intrest is : " + a.getyearlyInterest() + " Rupees ");
      System.out.println("If you want to deposit press 1 : ");
      System.out.println("If you want to withdraw press 2 : ");
      int k = sc.nextInt();
      if (k == 1) {
        a.deposit();
      } else if (k == 2) {
        a.withdraw();
      }
    }
    // sc.close();
  }

}

class Account {
  private int id = 0;
  static double acb = 500;
  private double annualInterestRate = 7;
  private Date dateCreated = new Date();
  double w;
  double d;    

  Account() {
    // default Account
    System.out.println("\nWelcome to A.R.INTELLIGENCE BANK ");
    System.out.println("YOUR ID IS : " + id);
    System.out.println("YOUR NAME IS : HARSH RAJESHBHAI DUDHAT ");
    System.out.println("YOR ACCOUNT BALANCE : " + acb);
    System.out.println("YOUR ACCOUNT INTEREST RATE IS : " + annualInterestRate+" %");
    System.out.println("ACCOUNT CREATED DATE : \n" + dateCreated);
  }

  Account(int i, double j) {
    i = id;
    j = acb;
  }

  double getMonthlyInterestRate() {
    double mir = annualInterestRate / 12;
    return mir;
  }

  double getMonthlyInterest() {
    double mirr = acb * (annualInterestRate / 12) * 1 / 100;
    return mirr;
  }

  double getyearlyInterest() {
    double yir = acb * annualInterestRate * 1 / 100;
    return yir;
  }

  public void withdraw() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount You want to Withdraw : ");
    w = sc.nextDouble();
    acb = acb - w;
    System.out.println("The account balance is : " + acb);
    // sc.close();
  }

  public void deposit() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount You want to Deposit : ");
    d = sc.nextDouble();
    acb = acb + d;
    System.out.println("The account balance is : " + acb);
    // sc.close();
    
  }
}
