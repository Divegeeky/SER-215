/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/

/*******************************************************Region Superclass*********************************************************************************************************/
 public class Account {
	 private int id;
	 private double balance,annualInterest;
	 private Date dateCreated;
/*******************************************************Region Methods************************************************************************************************************/
	 public Account(){
		 this.setId(0);
		 this.setBalance(0);
		 this.setAnnualInterest(0);
		 this.dateCreated= new Date();
	 }
	 public Account(int id, double bal, double ann){
		 this.setId(id);
		 this.setBalance(bal);
		 this.setAnnualInterest(ann);
		 this.dateCreated = new Date();
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterest() {
		return annualInterest;
	}
	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}
	public  String getDateCreated(){
		return this.dateCreated.toString();
	}
	public double getMonthlyInterest(){
		return this.annualInterest/12;
	}
	public void withdraw(double with){
		this.balance = this.balance - with;
	}
	public void deposit(double dep){
		this.balance = this.balance + dep;
	}
	public void deposit(int dep){
		this.balance = this.balance + dep;
	}
/*******************************************************End Region Methods********************************************************************************************************/
 }
/*******************************************************End Region Superclass*****************************************************************************************************/

