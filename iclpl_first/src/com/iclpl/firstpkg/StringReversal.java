package com.iclpl.firstpkg;



public class StringReversal {

	
	public static void main(String[] args) {
		
		String s1 = "Tapas Padhi";
		
		
		
		//Method 1 :
		String reverse = "";
		
		int lenghtOfS1 = s1.length();
		
		for (int i=(lenghtOfS1-1);i>=0;i--){
			
			reverse = reverse + s1.charAt(i);
		}
		
		System.out.println(reverse);
		
		//Method 2 :
		String s2 = new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
		
				
		
		
	}

}
