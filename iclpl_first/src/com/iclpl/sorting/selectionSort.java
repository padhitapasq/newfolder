package com.iclpl.sorting;

class SelSort{

	public void sort(int[] arr){
	
	for (int i=0;i<arr.length-1;i++){
		int index = i;
		for (int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[index]){
				index=j;
			}
		}
		int smallNumber = arr[index];
		arr[index] = arr[i];
		arr[i]=smallNumber;
		
	}
	
		}
	
	
	
}

public class selectionSort {

	public static void main(String[] args) {
		
		int [] arr =  {5,1,12,-5,16,2,12,14};
		SelSort s1 = new SelSort();
		s1.sort(arr);
		
		for (int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
			//System.out.println(arr.length);
		}
	}

}
