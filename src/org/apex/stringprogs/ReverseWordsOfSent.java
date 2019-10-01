  package org.apex.stringprogs;

public class ReverseWordsOfSent {

	public static void main(String[] args) {

		String input = "This is a java program"; 
		String[] data = input.split("\\s+");
		StringBuffer result=new StringBuffer();	
		for (int i = 0; i < data.length; i++) {
			result.append(new StringBuffer(data[i]).reverse());
			result.append(" ");

		}
		System.out.println(result);

	}

}
