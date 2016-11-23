package com.iclpl.javabasics;

class Address {

	String area,city,country;
	
	public Address(String area, String city, String country){
		this.area=area;
		this.city=city;
		this.country=country;
	}
	
}
public class Employee {  
int id;  
String name;  
Address address;  
  
public  Employee(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.country+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Employee e=new Employee(111,"varun",address1);  
Employee e2=new Employee(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  