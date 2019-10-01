package org.apex.arithmaticop;

import java.util.Scanner;

public class ExFourStudentAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for six subjects");
		int sub1 = input.nextInt();
		int sub2 = input.nextInt();
		int sub3 = input.nextInt();
		int sub4 = input.nextInt();
		int sub5 = input.nextInt();
		int sub6 = input.nextInt();
		int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		double average = total / 6;
		System.out.println("Total is -------->" + total);
		System.out.println("Average is----->" + average);

		input.close();

	}
}
// Author---Rekha
// Date------05/24/18