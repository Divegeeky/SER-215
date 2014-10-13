package assignment6;

public class data {
	double[] data;
	double datasize;
	
	public data(double[] data){
		this.data= data;
		this.datasize = data.length;
	}
	double getMean(){
		double sum = 0;
		for (int i=0; i<=datasize-1; i++){
			sum = sum + data[i];
		}
		return sum/datasize; 
	}
	double getStdDev(double mean){
		double sum = 0;
		for (int i=0; i<=datasize-1; i++){
			sum = sum + Math.pow((data[i]-mean), 2); 
		}
		double tempnum = sum/(datasize-1);
		return Math.sqrt(tempnum);
	}
	void printArray(){
		for (int i=0; i<=datasize-1; i++){
			if(i<datasize-1){
				System.out.print(data[i]+ ", ");
			}
			if (i==datasize-1){
				System.out.print(data[i]);
			}
		}
	}
}
