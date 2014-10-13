import java.util.*;

public class GCD_Program {
	static Scanner myscanner = new Scanner (System.in);
	public static void main(String[] args) {
		menu();
	}
	public static void menu(){
		System.out.println("Welcome to my Greatest Common Demoninator program.");
		System.out.println("We will begin by selecting how many pairs of numbers you wish to know the GCD for:");
		int loopnum = myscanner.nextInt();
		int[] array = buildarray(loopnum);
		printArray(array);
	}
	public static int[] buildarray(int input){
		int[] array = new int[(input*2)];
		System.out.println("Please input your integers and press enter after each one");
		for (int i = 0; i<array.length; i++){
			System.out.println("Enter:");
			array[i]=myscanner.nextInt();
		}
		return array;
	}
	public static int getGCD(int in1, int in2){
		int a=0, b=0;
		if (in1 > in2){
			a = in1;
			b = in2;
		}
		if (in2 > in1){
			a = in2;
			b = in1;
		}
		if (in1 == in2){
			return in1;
		}
		boolean exitloop = false;
		while (exitloop==false){
			if (a%b == 0){
				return b;
			}
			if (a%b != 0){
				b = a%b;
			}
		}
		return b;
	}
	public static void printArray(int[] arraytobeprinted){
		for (int i=0,j=0; i<arraytobeprinted.length/2; i++){
			System.out.println("The GCD of "+ arraytobeprinted[j] + " and "+ arraytobeprinted[j+1]+ " is " + getGCD(arraytobeprinted[j],arraytobeprinted[j+1]) );
			j=j+2;
		}
	}
}
