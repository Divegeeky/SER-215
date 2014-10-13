/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
import java.util.*;

/*******************************************************Region Superclass*********************************************************************************************************/
public class TestAccount {
	//Define the scanner object to be utilized throughout the program
		static Scanner myscanner = new Scanner (System.in);
/*******************************************************Region Main***************************************************************************************************************/
	public static void main(String[] args) {
		try{
			System.out.println("Hello and welcome to Half Arsed Banking! We will now begin to create some accounts. ");System.out.println("We will start with your Checking account.");
			System.out.println("Please input an id number: ");
			int idnum1 = myscanner.nextInt();
			System.out.println("Please input a starting balance: ");
			double balance1 = myscanner.nextDouble();
			System.out.println("Please input a starting interest rate: ");
			double annualint1 = myscanner.nextDouble();
			Checking newChecking = new Checking(idnum1, balance1, annualint1);
			System.out.println("Now we will create your Savings Account.");
			System.out.println("Please input an id number: ");
			int idnum2 = myscanner.nextInt();
			System.out.println("Please input a starting balance: ");
			double balance2 = myscanner.nextDouble();
			System.out.println("Please input a starting interest rate: ");
			double annualint2 = myscanner.nextDouble();
			Savings newSavings = new Savings(idnum2, balance2, annualint2);
			System.out.println("We will now withdraw some $$ from Checking, How much spending Cash do you want?");
			double with = myscanner.nextDouble();
			newChecking.withdraw(with);
			System.out.println("Your current balance is: $" + newChecking.getBalance());
			System.out.println("We will now deposit some money into Checking. How much??");
			double dep = myscanner.nextDouble();
			newChecking.deposit(dep);
			System.out.println("We will now withdraw some $$ from Savings, How much spending Cash do you want?");
			double with1 = myscanner.nextDouble();
			newSavings.withdraw(with1);
			System.out.println("Your current balance sis: $" + newSavings.getBalance());
			System.out.println("We will now deposit some money into Savings. How much??");
			double dep1 = myscanner.nextDouble();
			newSavings.deposit(dep1);
			System.out.println("Your current balance in Checking is: $" + newChecking.getBalance());
			System.out.println("Your monthly interest in Checking is: "+ newChecking.getMonthlyInterest());
			System.out.println("The date your Checking account was created is: "+ newChecking.getDateCreated());
			System.out.println("Your current balance in Savings is: $" + newSavings.getBalance());
			System.out.println("Your monthly interest in Savings is: "+ newSavings.getMonthlyInterest());
			System.out.println("The date your Savings account was created is: "+ newSavings.getDateCreated());
		}
		 catch (InputMismatchException e){
			 System.out.println("Input was incorrect, please use Double or Integer.");
		 }
	}
	
/*******************************************************End Region Main***********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/
 