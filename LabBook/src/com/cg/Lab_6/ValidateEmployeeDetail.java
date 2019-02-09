package com.cg.Lab_6;
class InputException extends Exception
{
	private static final long serialVersionUID = 1L;

	InputException(String str)
	{
		super(str);
	}
}

public class ValidateEmployeeDetail
{
	void check(String s1,String s2) throws InputException
	{
		if(s1.length()==0||s2.length()==0)
		{
			throw new InputException("Wrong Input");
		}
		else
		{
			System.out.println("Valid input");
		}
	}


	public static void main(String[] args)
	{
		String fname="Satyapal";
		String lname="Kumar";
		
		ValidateEmployeeDetail obj=new ValidateEmployeeDetail();
		try
		{
			obj.check(fname, lname);
		}
		catch(Exception p)
		{
			System.out.println(p.getMessage());
		}
		
		

	}

}
