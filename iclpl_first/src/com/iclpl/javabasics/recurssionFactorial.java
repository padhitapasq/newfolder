package com.iclpl.javabasics;

public class recurssionFactorial {

	public static int fact(int i){
		if (i==1)
			return i;
		else
			return(i*fact(i-1));
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));

	}

}
