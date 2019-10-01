package org.apex.loopsassignments;

import java.util.Scanner;

public class TestWeight {

	public static void main(String[] args) {
		double leftSide = 0, rightSide = 0, ltot = 0, rtot = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter value for leftside");
		leftSide = a.nextDouble();
		System.out.println("Enter value for rightside");
		rightSide = a.nextDouble();
		ltot = ltot + leftSide;
		rtot = rtot + rightSide;
		while (leftSide != rightSide) {
			System.out.println("both are Not equal");
			System.out.println("Enter value for leftside");
			leftSide = a.nextDouble();
			System.out.println("Enter value for rightside");
			rightSide = a.nextDouble();
			ltot = ltot + leftSide;
			rtot = rtot + rightSide;
			leftSide = ltot;
			rightSide = rtot;
		}
		System.out.println("Total is correct !!!!");
		a.close();
	}
}

// Author-----Rekha
// Date--------05/24/18
