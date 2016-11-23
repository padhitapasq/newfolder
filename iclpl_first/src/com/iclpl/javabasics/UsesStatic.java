package com.iclpl.javabasics;

class Child {

	public static int count = 0;
	public int size = 0;

	public void showMethods() {
		System.out.println("Static variable is : " + count
				+ ", not static variable is : " + size);
	}

	public Child() {
		count++;
		size++;
	}

}

class UsesStatic {
	public static void main(String ard[]) {
		Child us1 = new Child();

		us1.showMethods();

		Child us2 = new Child();

		us2.showMethods();

	}

}