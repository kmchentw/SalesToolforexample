package ca.demo.salestool;

/**
 * Represent the sales data for a given period.
 */
public class SalesData {
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		
		System.out.println("Data: ");

		int sum = 0;
		for (int i=0; i<data.length;i++) {
			System.out.println("Next value: " + data[i]);
			sum += i;
		}
		
		//new for
		for (int j=0; j<data.length;j++) {
			System.out.println("Next value:" + j);
		}
		
		System.out.println("Sum is: " + sum);
	}

}
