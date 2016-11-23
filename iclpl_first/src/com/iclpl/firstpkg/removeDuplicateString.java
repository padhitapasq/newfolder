package com.iclpl.firstpkg;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateString {

	public static void main(String[] args) {
		
		String str = "Tapas Padhi";
		
		char [] c = str.toCharArray();
		int lengthStr = c.length;
		
		Set<Character> set1 = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<lengthStr;i++){
			Character s1 = str.charAt(i);
			
			if (!set1.contains(s1)){
				set1.add(s1);
				sf.append(s1);
			}
			
		}
		System.out.println(sf.toString());

	}

}
