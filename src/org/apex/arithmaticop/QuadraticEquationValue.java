package org.apex.arithmaticop;

import java.util.Scanner;

public class QuadraticEquationValue {

	public static void main(String args[]) {
		System.out.println("Enter a value for x");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int result = 3 * x ^ 2 - 8 * x + 4;
		System.out.println("input::" + x);
		System.out.println("output:: " + result);
		System.out.println("Result after substituting x value is");
		System.out.println("3*" + x + "*" + "2" + "-" + " " + "8*" + x + "+" + "4" + "=" + result);
		input.close();
	}

}
// Author---Rekha
// Date------05/24/18