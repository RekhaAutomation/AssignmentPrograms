package org.apex.ifelse;

import java.util.Scanner;

public class ExOneDiscountPrice {

	public static void main(String[] args) {
		System.out.println("Enter item price to caliculate 5% discount ");
		Scanner input=new Scanner(System.in);
		double itemPrice=input.nextDouble();
		double discount=(itemPrice)*5/100;
		System.out.println("discount on item is----> "+discount);
		input.close();
	}

}
//Author---Rekha
//Date------05/25/18