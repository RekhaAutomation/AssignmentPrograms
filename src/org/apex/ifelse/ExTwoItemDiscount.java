package org.apex.ifelse;

import java.util.Scanner;

public class ExTwoItemDiscount {

	public static void main(String[] args) {
		System.out.println("Enter price of an item");
		Scanner input=new Scanner(System.in);
		double itemPrice=input.nextDouble();
		double minPurchase=10.00;
		double discount;
				if(itemPrice>minPurchase) {
					 discount=(itemPrice)*5/100;
					 System.out.println("discount on item is--->"+"$"+discount);
					 System.out.println("Item price after discount--->"+"$"+(itemPrice-discount));
				}
		input.close();
	}

}
//Author---Rekha
//Date------05/25/18