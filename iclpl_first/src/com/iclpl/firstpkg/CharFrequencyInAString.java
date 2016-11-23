package com.iclpl.firstpkg;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyInAString {

		public static void main(String[] args) {
		
			String set1 = "This is inforstretch corporation";
			
			char[] c1 = set1.toCharArray();
			
			Map<Character,Integer> map1 = new HashMap<Character,Integer>();
			
			for(char c: c1){
				if(!map1.containsKey(c)){
					map1.put(c, 1);
				}else{
					map1.put(c, map1.get(c)+1);
				}
			}
			System.out.println("The frequency of characters are " + map1);				
	}

}
