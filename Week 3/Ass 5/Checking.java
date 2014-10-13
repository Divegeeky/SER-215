/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
/*******************************************************Region Subclass*********************************************************************************************************/
 public class Checking extends Account {
	
/*******************************************************Region Methods************************************************************************************************************/
	 public Checking(){
		 super();
	 }
	 public Checking(int id, double bal, double ann){
		 super(id,bal,ann);
	 }
	 public void withdraw(double with){
		 double currentbal = super.getBalance();
		 if (currentbal-with < -5000.00){
			 System.out.println("I'm sorry you cannot withdraw that much, since you will go below the overdraft protection.");
		 }
		 if (currentbal-with > -5000.00){
			 super.withdraw(with);
		 }
	 }
	 public void withdraw(int with){
		 double currentbal = super.getBalance();
		 if (currentbal-with < -5000.00){
			 System.out.println("I'm sorry you cannot withdraw that much, since you will go below the overdraft protection.");
		 }
		 if (currentbal-with > -5000.00){
			 super.withdraw(with);
		 }
	 }
/*******************************************************End Region Methods********************************************************************************************************/
 }
/*******************************************************End Region Subclass*****************************************************************************************************/

