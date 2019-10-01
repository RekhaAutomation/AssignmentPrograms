package org.apex.ifelse;

import java.util.Scanner;

public class ExThreeCandCks {

	public static void main(String[] args) {
		double total;
		double discount;
		double cookiePrice = 0.05;
		double cakePrice = 0.03;
		double minVal = 10.00;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cookies ");
		int cookies = input.nextInt();
		System.out.println("Enter number of cakes");
		int cakes = input.nextInt();
		;
		total = (cookies * cookiePrice) + (cakes * cakePrice);
		if (total > minVal) {
			discount = (total) * 5 / 100;
			System.out.println("discount on your purchase is--->" + "$" + discount);
			System.out.println("Total after discount--------------->" + "$" + (total - discount));
		} else {
			System.out.println("your total purchase is ------>" + "$" + total);
		}
		input.close();
	}

}
// Author---Rekha
// Date------05/25/18