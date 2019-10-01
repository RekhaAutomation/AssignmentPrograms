package org.apex.loopassignments2;
import java.util.Scanner;

public class Ex5Stars {
					public static void main(String[] args) {
					int j=0,i=0;
					Scanner ip=new Scanner(System.in);
					System.out.println("Enter an iteger");
					int n=ip.nextInt();
					
					while (i<n){
					    while (j<n) {
					    	System.out.print("*");	
					    	j=j+1;
					    }
					    j=0;
					    n--;
					    System.out.println();	 
					    ip.close();
					    					}	    	
				}
		}
//Author---Rekha
//Date------05/25/18
