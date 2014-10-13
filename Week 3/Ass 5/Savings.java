/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
/*******************************************************Region Subclass*********************************************************************************************************/
 public class Savings extends Account {
	
/*******************************************************Region Methods************************************************************************************************************/
	 public Savings(){
		 super();
	 }
	 public Savings(int id, double bal, double ann){
		 super(id,bal,ann);
	 }
	 public void withdraw(double with){
		 double currentbal = super.getBalance();
		 if (currentbal-with < 0){
			 System.out.println("I'm sorry you cannot withdraw that amount.");
		 }
		 if (currentbal-with >= 0){
			 super.withdraw(with);
		 }
	 }
	 public void withdraw(int with){
		 double currentbal = super.getBalance();
		 if (currentbal-with < 0){
			 System.out.println("I'm sorry you cannot withdraw that amount.");
		 }
		 if (currentbal-with > 0){
			 super.withdraw(with);
		 }
	 }
/*******************************************************End Region Methods********************************************************************************************************/
 }
/*******************************************************End Region Subclass*****************************************************************************************************/

