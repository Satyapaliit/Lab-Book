package com.cg.Lab_3;

public class PositiveString
{

	public static void main(String[] args)
	{
		String str="aabc";
		str=str.toLowerCase();
		int flag=1;
		char ch=str.charAt(0);
		int lengthStr=str.length();
		for(int i=1;i<lengthStr;i++)
		{
			if(ch>str.charAt(i))
			{
				flag=0;
				break;
			}
			else
			{
				ch=str.charAt(i);
			}
		}
		if(flag==1)
		{
			System.out.println("Positive String!");
		}
		else
		{
			System.out.println("String not positive!");
		}
	}

}
