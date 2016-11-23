package com.iclpl.firstpkg;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {

	public static void main(String[] args) {
		
		String [] s1 = {"Java","Selenium","Python","QTP","Jmeter","Java","Jmeter"};
		
		Set<String> duplicates = new HashSet<>();
		Set<String> nonDuplicates = new HashSet<>();
		
		for (String s2 : s1){
			if(!nonDuplicates.contains(s2)){
				nonDuplicates.add(s2);
			}else{
				duplicates.add(s2);
			}
		}
		System.out.println("Dupluicate elements are : "+ duplicates);
		System.out.println("Unique elements are : "+ nonDuplicates);
	}

}
