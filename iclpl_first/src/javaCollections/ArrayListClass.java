package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Tapas");
		alist.add("Kunal");
		alist.add("July");
		
		System.out.println(alist);
		
		Iterator<String> newir= alist.iterator();
		
		while(newir.hasNext()){
			System.out.println(newir.next());
		}
	}

}
