package com.cg.Lab_2;

public class PersonMain
{

	public static void main(String[] args)
	{
		Person obj1=new Person("Satyapal","Kumar",'M');
		
		System.out.println("Person Details:\n---------------");
		System.out.println("First Name: "+obj1.First_Name);
		System.out.println("Last Name: "+obj1.getLast_Name());
		System.out.println("Gender: "+obj1.getGender());
		
		
	}

}