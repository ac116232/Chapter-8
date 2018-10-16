package Exercises;

import java.util.Scanner;

public class DistanceFromAverage 
{

	public static void main(String[] args) {
		String total = null;
		// TODO Auto-generated method stub
		System.out.println("Total: " + total);
		double[] arrayNums = new double [5];
		double userEntry;
		Scanner input = new Scanner(System.in);
		
		for(int i= 0; i < arrayNums.length; i++) {
			System.out.println("Enter a number >>> ");
			arrayNums[i] = input.nextDouble();
		}
		
		System.out.println("The output is: ");
		for(int j=4; j>= 0; j--) {
			System.out.println(arrayNums[j]);
			int[] numArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
			String[] stringArray = {"This", "is", "and", "a"};
			System.out.println("Print numbers first to last");
			
			for(int i = 0; i < numArrays.length; i++) {
				System.out.println("numbers in order " + numArrays[i]);
			}
			System.out.println("Print numbers last to first");
			for(int m = 11; j >= 0; j--) {
				System.out.println("numbers in reverse order " + numArrays[j]);
			}
			for(int z = 0; z<stringArray.length; z++) {
				System.out.print(stringArray[z]);
	}
		}
}
}