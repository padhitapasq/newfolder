package com.iclpl.javabasics;

public class recurssion {  
 static int i=0,j=1,k=0;
 
 public static void doFiboniacci(int l){
	if(l>0){
		 k=i+j;
		 i=j;
		 j=k;
		 System.out.print(" "+k);
		 doFiboniacci(l-1);
	 }
	 }
	 public static void main(String args[]){
		int count = 15;
		System.out.print(i+ " " +j);
		doFiboniacci(count-2);
	 }
 
} 
