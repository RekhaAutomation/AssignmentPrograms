package org.apex.loopassignments2;

import java.util.Scanner;

public class SquareOfFirstnum {

	public static void main(String[] args) {
		int b = 0, c = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter an iteger");
		int a = ip.nextInt();
		for (int k = a; k > 0; k--) {
			b = a * a;
			c = c + b;
			System.out.println(a + "X" + a + "=" + b);
			a = a - 1;
		}
		ip.close();
		System.out.println("Total.........." + c);
	}
}

// Author---Rekha
// Date------05/25/18