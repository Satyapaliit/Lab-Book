package com.cg.Lab_2;

public class PersonDetails
{
	String First_Name;
	int Age;
	public PersonDetails(String fname,int age)
	{
		this.First_Name=fname;
		this.Age=age;
	}

	public static void main(String[] args)
	{
		String First_Name= "Divya";
		String Last_Name= "Bharathi";
		char Gender= 'F';
		int Age= 20;
		double Weight=85.55;
		System.out.println("Person Details:\n---------------");
		System.out.println("First Name: "+First_Name);
		System.out.println("Last Name: "+Last_Name);
		System.out.println("Gender: "+Gender);
		System.out.println("Age: "+Age);
		System.out.println("Weight: "+Weight);
	}

}
