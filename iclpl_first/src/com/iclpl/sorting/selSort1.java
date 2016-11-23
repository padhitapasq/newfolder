package com.iclpl.sorting;
//Not working
public class selSort1 {

		public static void main(String[] args) {
		
			int [] arr = {5,1,6,-1,-2,10};
			int minIndex,minValue,temp=0;
			
			for(int i=0;i<arr.length;i++){
				minValue = arr[i];
				minIndex = i;
				
				for(int j=i;j<arr.length;j++){
					if(arr[j]<minValue){
						minValue = arr[j];
						minIndex = j;
					}
				}
				if(arr[i]<minValue){
					temp = arr[i];
					arr[i]=arr[minIndex];
					arr[minIndex] = temp;
				}
				
			}
			
			for (int k=0;k<arr.length;k++){
				System.out.println(arr[k]);
			}

	}

}
