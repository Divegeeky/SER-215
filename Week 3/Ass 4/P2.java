/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
import java.util.*;

/*******************************************************Region Superclass*********************************************************************************************************/
public class P2 {
	//Define the scanner object to be utilized throughout the program
		static Scanner myscanner = new Scanner (System.in);
/*******************************************************Region Main***************************************************************************************************************/
	public static void main(String[] args) {
		System.out.println("Hello and welcome to Half Arsed Banking! We will now begin to create an account. ");
		System.out.println("Please input an id number: ");
		int idnum = myscanner.nextInt();
		System.out.println("Please input a starting balance: ");
		double balance = myscanner.nextDouble();
		System.out.println("Please input a starting interest rate: ");
		double annualint = myscanner.nextDouble();
		Account newAccount = new Account(idnum, balance, annualint);
		System.out.println("We will now withdraw some $$, How much spending Cash do you want?");
		double with = myscanner.nextDouble();
		newAccount.withdraw(with);
		System.out.println("Your current balance is: $" + newAccount.getBalance());
		System.out.println("We will now deposit some money. How much??");
		double dep = myscanner.nextDouble();
		newAccount.deposit(dep);
		System.out.println("Your current balance is: $" + newAccount.getBalance());
		System.out.println("Your monthly balance is: "+ newAccount.getMonthlyInterest());
		System.out.println("The date your account was created is: "+ newAccount.getDateCreated());
	}
	
/*******************************************************End Region Main***********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/
 