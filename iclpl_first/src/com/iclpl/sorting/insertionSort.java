package com.iclpl.sorting;

public class insertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] arr =  {5,1,12,-5,16,2,12,14};
		
		for (int i=1;i<arr.length;i++){
			int key = arr[i];
			int j=i-1;
			while((j>-1)&&(arr[j]>key)){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		for(int i: arr){
			System.out.println(i);
		}

	}

}
