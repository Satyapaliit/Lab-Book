package com.cg.Lab_2;

enum Gender
{
	M,F;
}

public class Enum
{
	Gender gender;
	

	public static void main(String[] args)
	{
		Person obj1=new Person("Satyapal","Kumar",Gender.M);
		System.out.println("Person Details:\n---------------");
		System.out.println("First Name: "+obj1.First_Name);
		System.out.println("Last Name: "+obj1.getLast_Name());
		System.out.println("Gender: "+obj1.genderEnum);

	}

}
