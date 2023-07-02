package classEx3;
import java.util.Arrays;

public class StatMiddleValue {
	
	public static double mean(double[] arr, int n) {
		double total = 0;
		for (int i = 0; i < n; i ++) {
			total += arr[i];
		}
		return total / n;
	}
	
	public static double median(double[] arr,int n) {
		double [] temp = new double[n];
		for (int i = 0; i < n; i ++) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		if (n%2 == 0) {
			return  (temp[n / 2] + temp[n/2 - 1])/2;
		}
		else{
			return temp[n/2];
		}
	}
	
	public static double mode(double [] arr, int n) {
		int highestCount = 1;
		int highestIndex = 0;
		for (int i = 0; i < n; i ++) {
			int count = 0;
			for (int j = 0; j < n; j ++) {
				if (arr[i] == arr[j]) {
					count += 1;
				};
			}
			if (count > highestCount) {
				highestCount = count;
				highestIndex = i;
			}
		}
		if (highestCount == 1) { //I want to test for the case with no mode.
			return -1;
		}
		else {
			return arr[highestIndex];
		}
	}
	
	public static void main(String[] args) {
		//Case1
		//Testing with a random generated array from values (0 to 100) and array size of 150.
		int n = 150;
		double [] arr = new double[n];
		
		for (int i =0; i < n; i ++) {
			arr[i] = (int)(Math.random() * 101);
		}
		System.out.print ("Case1: ");
		System.out.println("Testing with random-generated array(value from 0 to 100), array size of 150 ");
		System.out.println("Random generated array: " + Arrays.toString(arr));
		System.out.println("mean is " + mean(arr,n));
		System.out.println("median is " + median(arr,n));
		if (mode(arr,n) > 0) {
			System.out.println("mode is " + mode(arr,n));
		}
		else { //This is for the case with no mode.
			System.out.println("There is no mode.");
		}
		System.out.println("************************************************************");
		System.out.println();
		
		//Case 2
		//First testing with a predefined array from 0 to 10, with two 10.0 to test the mode.
		System.out.print ("Case2: ");
		System.out.println("Testing with pre-defined array(Case with mode) ");
		double [] testArr = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,10.0};
		System.out.println("Predefined array: " + Arrays.toString(testArr));
		System.out.println("mean is " + mean(testArr,testArr.length));
		System.out.println("median is " + median(testArr,testArr.length));
		if (mode(testArr,testArr.length) > 0) {
			System.out.println("mode is " + mode(testArr,testArr.length));
		}
		else { // This is for the case with no mode.
			System.out.println("There is no mode.");
		}
		System.out.println("*************************************************");
		System.out.println();
		
		//Case3
		//Testing with an array with no mode and odd size array
		System.out.print ("Case3: ");
		System.out.println("Testing with pre-defined array(Case with no mode and odd size array) ");
		double [] testArr2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		//testArr2 is an array with no mode and odd size array.
		System.out.println("Predefined array: " + Arrays.toString(testArr2));
		System.out.println("mean is " + mean(testArr2,testArr2.length));
		System.out.println("median is " + median(testArr2,testArr2.length));
		if (mode(testArr,testArr2.length) > 0) {
			System.out.println("mode is " + mode(testArr2,testArr2.length));
		}
		else { // This is for the case with no mode.
			System.out.println("There is no mode.");
		}
		System.out.println("*************************************************");
	}
}
