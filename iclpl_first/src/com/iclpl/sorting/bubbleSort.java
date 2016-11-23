package com.iclpl.sorting;

import java.util.Scanner;

class bubble{
	
	int no;
	int array[];
	Scanner input;
	double startTime , endTime;
	
	void getData(int no){
		this.no = no;
		array = new int[no];
		input = new Scanner(System.in);
	}
	void setData(){
		for (int i=0;i<no;i++){
			array[i] = (int) (Math.random()*1000);
		}
	}
	void startSort(){
		int temp;
		startTime = System.currentTimeMillis();
		for(int j=0;j<no;j++){
			for(int k=0;k<no-1;k++){
				if(array[k]>array[k+1]){
					temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		endTime = System.currentTimeMillis();
	}
	
	void displayElements(){
		for (int i = 0;i<no;i++){
			System.out.println(array[i]);
			
		}
		System.out.println("Time taken for this sorting is : " + (startTime-endTime));
	}
}


public class bubbleSort {

	public static void main(String[] args) {
		
					
		bubble bs1 = new bubble();
		bs1.getData(15);
		bs1.setData();
		bs1.startSort();
		bs1.displayElements();
		
		
	}

}
