package org.apex.loopsassignments;

import java.util.Scanner;

public class ExTwoDispSquareVal {
	
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter two values ");
	int a=input.nextInt();
	int b=input.nextInt();
	while(a<=b) {
		int sqVal=a*a;
		System.out.println(a+"      "+sqVal);
		a++;
}
	input.close();
}
}
//Author-----Rekha
//Date--------05/24/18