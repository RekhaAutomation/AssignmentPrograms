package org.apex.loopassignments2;

import java.util.Scanner;

public class ExTwoDoubleValues {

	public static void main(String[] args) {
		double sum = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a double value");
		double x = inp.nextDouble();

		while (x != 0) {
			sum = sum + x;
			System.out.println("sum is =" + sum);
			System.out.println("Enter a double value");
			x = inp.nextDouble();
		}
		System.out.println("");

		inp.close();

	}

}
// Author---Rekha
// Date------05/25/18