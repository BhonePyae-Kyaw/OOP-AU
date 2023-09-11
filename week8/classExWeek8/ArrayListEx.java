package classExWeek8;
import java.util.ArrayList; //for constructing array list
import java.util.Scanner; //for input
import java.util.Collections; //for sorting

public class ArrayListEx {
	
	public static double getAverage(ArrayList<Double> MyArrayList) {
		double total = 0;
		for (double i : MyArrayList) { //loop through array list
		      total += i; // to find total
		}
		return total / MyArrayList.size(); // to find average
	}

	public static void main(String[] args) {
		ArrayList<Double> myNumbers = new ArrayList<Double>();
		Scanner s = new Scanner(System.in);
		
		//Ask for N
		System.out.println("Enter how many real numbers you want to calculate: ");
		int N = s.nextInt();
		
		int count = 0;
		
		while (count < N) {
			System.out.println("Enter your number: ");
			double number = s.nextDouble(); //ask for the numbers
			myNumbers.add(number); //adding numbers to array list.
			count += 1; // increment by 1
		};
		
		//Print out sorted list
		Collections.sort(myNumbers);
		System.out.println("The sorted array list " + myNumbers);
		
		System.out.println("Average of your numbers is " +getAverage(myNumbers));
		
		s.close();
	}
}

//Output of the program.
//Enter how many real numbers you want to calculate: 
//5
//Enter your number: 
//1.5
//Enter your number: 
//4.1
//Enter your number: 
//0.2
//Enter your number: 
//2.1
//Enter your number: 
//9.0
//The sorted array list [0.2, 1.5, 2.1, 4.1, 9.0]
//Average of your numbers is 3.38

