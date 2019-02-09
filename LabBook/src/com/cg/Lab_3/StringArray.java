package com.cg.Lab_3;

import java.util.*;

public class StringArray
{
	public String[] sortStringArray(String[] str)
	{
		Arrays.sort(str);
		int length=str.length;
		
		for(int i=0;i<length;i++)
		{
			str[i]=str[i].toUpperCase();
		}
		
		Arrays.sort(str);
		
	
			
		
		if(length%2==0)
		{
			for(int i=0;i<length/2;i++)
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=length/2;i<length;i++)
			{
				str[i]=str[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<length/2+1;i++)
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=length/2+1;i<length;i++)
			{
				str[i]=str[i].toLowerCase();
			}
		}
		
		
		
		return str;
	}

	public static void main(String[] args)
	{
		String[] strar= new String[]{"Satyapal","Rahul","Taimoor","Chauhan","Ram"};
		StringArray obj1=new StringArray();
		String[] strarray2=obj1.sortStringArray(strar);
		for(String str2:strarray2)
		{
			System.out.println("Result:"+str2);
		}
		
	}

}
