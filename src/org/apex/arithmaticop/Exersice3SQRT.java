package org.apex.arithmaticop;

import java.util.Scanner;

public class Exersice3SQRT {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a,b and c to find out the sqare roots for the following equation");
		System.out.println("a*X^2 + b*X + c=0");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double r = (b * b - 4 * a * c) / 2 * a;
		double root1 = -b + Math.sqrt(r);
		double root2 = -b - Math.sqrt(r);
		if(r<0) {
			System.out.println("");
		}
		else {
		System.out.println("Roots are");
		System.out.println("root1 is---->" + root1);
		System.out.println("root2 is---->" + root2);
		
		}
		
		input.close();
	}

}

//Author---Rekha
//Date------05/24/18