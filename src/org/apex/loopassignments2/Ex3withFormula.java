package org.apex.loopassignments2;

import java.util.Scanner;

public class Ex3withFormula {

			public static void main(String[] args) {
				int result=0;;
				Scanner ip=new Scanner(System.in);
				System.out.println("Enter an iteger");
				int n=ip.nextInt();
				result=(n*(n+1)*(2*n+1))/6;
				System.out.println("Result..........."+result);
				ip.close();
		}
	}

//Author---Rekha
//Date------05/25/18
