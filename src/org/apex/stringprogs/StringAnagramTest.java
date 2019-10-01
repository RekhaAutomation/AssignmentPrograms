package org.apex.stringprogs;

import java.util.Arrays;

public class StringAnagramTest {

	public static void main(String[] args) {
		String input1="Silent";
		String input2="Listen";
	
		
	char[] charArray=(input1.toLowerCase()).toCharArray();
		Arrays.sort(charArray);
		String sortedString=new String(charArray);
		System.out.println(sortedString);
		
		char[] charArray1=(input2.toLowerCase()).toCharArray();
		Arrays.sort(charArray1) ;
		String sortedString1=new String(charArray1);
		System.out.println(sortedString1);
			if(sortedString.equals(sortedString1)) {
				System.out.println("Given strings are anagrams");
			}else
			{
				System.out.println("Given strings are not anagrams");
			}
		
	}

}
