/** This Program was developed by Jason Pototsky
 9/10/2014 for Week 3 Assignment
 For SER215 Software Enterprise I - 88914
 Instructor: Srividya Bansal
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
 public class P1 {	
/*******************************************************Region Global Variables***************************************************************************************************/
	 static Scanner myscanner = new Scanner (System.in);
/*******************************************************End Region Global Variables***********************************************************************************************/	
/*******************************************************Region Main***************************************************************************************************************/
	public static void main(String[] args) {
		menu();
	}
/*******************************************************End Region Main***********************************************************************************************************/

/*******************************************************Region Sub-Class**********************************************************************************************************/

/*******************************************************End Region Sub-Class******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	public static String[] split(String s, String regex){
		String[] splitstring = s.split("(?<=["+regex+"])|(?=["+regex+"])");
		return splitstring;
	}
	public static void menu(){
		System.out.println("Hello and welcome to my string splitting program.");
		System.out.println("Please input the string that you wish to split: "); 
		String stringToSplit = myscanner.nextLine();
		System.out.println("You input: " + stringToSplit);
		System.out.println("Now please input the delimiter(s) that you wish to split on: ");
		String delimiter = myscanner.nextLine();
		String[] myArray = split(stringToSplit, delimiter);
		printArray(myArray);
	}
	public static void printArray(String[] arrayToPrint ){
		for (int i=0; i < arrayToPrint.length; i++){
			if (i<arrayToPrint.length -1)
				System.out.print(arrayToPrint[i] + ", ");
			if (i==arrayToPrint.length -1)
				System.out.print(arrayToPrint[i]);
		}
	}
/*******************************************************End Region Methods********************************************************************************************************/
 }
/*******************************************************End Region Superclass*****************************************************************************************************/