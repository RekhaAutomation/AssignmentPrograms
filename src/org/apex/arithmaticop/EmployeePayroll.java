package org.apex.arithmaticop;

import java.util.Scanner;

public class EmployeePayroll {

	public static void main(String[] args) {
		double sal;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter payrate value per hour");
		double payRate = input.nextDouble();
		System.out.println("Enter number of hours worked in a month");
		double hoursWorked = input.nextDouble();
		sal = payRate * hoursWorked;
		System.out.println("                                    Employee payroll                                  ");
		System.out.println("************************************************");
		// System.out.println("Name------------------------------------------ Rekha");
		System.out.println("Payrate value per hour---------------------" + "$" + payRate);
		System.out.println("Number of hours worked in a month---" + hoursWorked + "h");
		System.out.println("Monthy salary of the emloyee is---------" + "$" + sal);
		System.out.println("************************************************");
		input.close();

	}

}
//Author---Rekha
//Date------05/24/18