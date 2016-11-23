package com.iclpl.javabasics;

public class class1 implements inter2{

	/**
	 * @param args
	 */
	static class1 i1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object and reference of implemented class.
		i1 = new class1();
		i1.fun2();
				
		//reference of extended interface and object of the implemented class.
		inter2 i2 = new class1();
		i2.fun3();
		
		//reference of base interface and implemented class.
		inter1 ii1 = new class1();
		ii1.fun1();
	}

	@Override
	public void fun1() {
		System.out.println("function 1 method is implemented");
		
	}

	@Override
	public void fun2() {
		System.out.println("function 2 method is implemented");
		
	}

	@Override
	public void fun3() {
		System.out.println("function 3 method is implemented");
		
	}

}
