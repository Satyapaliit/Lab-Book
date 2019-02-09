package com.cg.Lab_2;

public class Person
{
	String First_Name;
	String Last_Name;
	char Gender;
	Gender genderEnum;
	float Age;
	
	
	
	
	
	@Override
	public String toString() {
		
		return "Person [A/c Holder=" + First_Name + ", Age=" + Age + "]";
	}


	public Person(String name,float age)
	{
		First_Name=name;
		Age=age;
	}


	public Person(String first_Name, String last_Name, char gender)
	{
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Gender = gender;
	}
	
	
	
	public String getFirst_Name()
	{
		return First_Name;
	}
	
	
	public float getAge()
	{
		return Age;
	}


	void setFirst_Name(String first_Name)
	{
		First_Name = first_Name;
	}


	String getLast_Name()
	{
		return Last_Name;
	}


	void setLast_Name(String last_Name)
	{
		Last_Name = last_Name;
	}


	char getGender()
	{
		return Gender;
	}


	void setGender(char gender)
	{
		Gender = gender;
	}

	
	
	
	//Lab 2.5
	
	public Person(String first_Name, String last_Name, Gender gender)
	{
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		genderEnum = gender;
	}
	
	

}

