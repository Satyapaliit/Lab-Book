package com.cg.Lab_6;
class AgeException extends Exception
{
	int msg;
	private static final long serialVersionUID = 1L;

	AgeException(int a)
	{
		this.msg=a;
	}

	public int getMsg()
	{
		return msg;
	}

	
	}
public class ValidateAge
{
	void check(int age) throws AgeException
	{
		if(age<15)
		{
			throw new AgeException(54544);
		}
		else
		{
			System.out.println("Valid Age");
		}
	}

	public static void main(String[] args)
	{
		int age=10;
		
		ValidateAge obj=new ValidateAge();
		try
		{
			obj.check(age);
		}
		catch(AgeException p)
		{
			System.out.println(p.getMsg());
		}
		
		

	}

}
