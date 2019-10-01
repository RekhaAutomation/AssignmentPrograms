package org.apex.loopassignments2;

import java.util.Scanner;

public class Ex6Factorial {

	public static void main(String[] args) {
		int result = 1, m = 1;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter an iteger");
		int n = ip.nextInt();
		for (int i = 1; i <= n; i++) {
			result = (m * i) * result;
		}
		System.out.println("Factorial of" + n + "is.." + result);
		ip.close();
	}

}
//Author---Rekha
//Date------05/25/18