package assignment6;
import java.util.*;
import java.io.*;
public class Main {
	static Scanner myscanner = new Scanner (System.in);
	public static void main(String[] args) throws IOException {
		menu();

	}
	public static double[] getUserInput(){
		double tempinput;
		List<Double> templist = new ArrayList<Double>();
		boolean cont = true;
		System.out.println("Good Afternoon, We will input some data into an array.");
		System.out.println("Please input -1 to exit.");
		while (cont == true){
			System.out.println("Please input your number now: ");
			tempinput = myscanner.nextDouble();
			if (tempinput != -1){
				templist.add(tempinput);
			}
			if (tempinput == -1){
				break;
			}
		}
		double[] temparray = new double[templist.size()];
		for (int i =0; i < templist.size(); i++){
			temparray[i]=templist.get(i);
		}
		return temparray;
	}
	public static double[] getFileContent(String Path) throws IOException{
		String line = "";
		FileInputStream input = new FileInputStream(Path);
		DataInputStream in = new DataInputStream(input);
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));
		List<Double> templist = new ArrayList<Double>();
		double tempinput;
		while((line = bf.readLine()) != null){
			tempinput = Double.parseDouble(line);
			templist.add(tempinput);
		}
		bf.close();
		double[] temparray = new double[templist.size()];
		for (int i=0; i < templist.size(); i++){
			temparray[i]=templist.get(i);
		}
		return temparray;
	}
	public static void menu() throws IOException{
		int temp;
		System.out.println("Hello and welcome to my calculator.");
		System.out.println("Would you like to input the data or get from a file? 1 for input 2 for file.");
		temp = myscanner.nextInt();
		if (temp == 1){
			double[] temparray = getUserInput();
			data mydata = new data(temparray);
			System.out.print("The array you input is: ");
			mydata.printArray();
			System.out.println();
			System.out.println("The Mean is: " + mydata.getMean());
			System.out.println("The Standard Deviation is: " + mydata.getStdDev(mydata.getMean()));
		}
		else if (temp == 2){
			System.out.println("Please input the path of the file:");
			String path = myscanner.nextLine();
			double[] temparray = getFileContent(path);
			data mydata = new data(temparray);
			System.out.print("The array you input is: ");
			mydata.printArray();
			System.out.println();
			System.out.println("The Mean is: " + mydata.getMean());
			double mean = mydata.getMean();
			System.out.println("The Standard Deviation is: " + mydata.getStdDev(mean));
			
		}
		else {
			System.out.println("You cannot follow isntructions");
			menu();
		}
	}
}
