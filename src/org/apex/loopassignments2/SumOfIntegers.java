package org.apex.loopassignments2;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x = inp.nextInt();

		while (x != 0) {
			sum = sum + x;
			System.out.println("sum is =" + sum);
			System.out.println("Enter an integer");
			x = inp.nextInt();
		}
		System.out.println("");

		inp.close();
	}
}
// Author-----Rekha
// Date--------05/26/18