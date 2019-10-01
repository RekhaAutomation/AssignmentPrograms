package org.apex.stringprogs;

public class StringPalindromeTest {

	public static void main(String[] args) {
		String input = "madam";
		String rev="";
		int length=input.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println("String revers with out String buffer****"+rev);
		StringBuffer sb = new StringBuffer(input);
		String res = sb.reverse().toString();
		if (input.equals(res)) {
			System.out.println("True!!!!");
		}

	}

}
