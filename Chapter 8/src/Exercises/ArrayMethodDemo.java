package Exercises;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salaries = {6.25, 6.55, 10.25, 16.85};
		double total = 0;
		
		System.out.println("Salaries one by one are: ");
		
		for(int i = 0; i < salaries.length; i = i + 1 ) {
			System.out.println(salaries[i]);
			total = total + salaries[i];
		}
		
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
		}
	}

}
