package com.cg.Lab_3;

import java.util.Scanner;

public class JobSeeker
{
	public boolean valUser(String user)
	{
		boolean bool=false;
		if(user.length()<8)
		{
			bool=false;
		}
		else
		{
			if(user.endsWith("_job"))
			{
				bool=true;
			}
			else
			{
				bool=false;
			}
		}
		
		return bool;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Username?:");
		String username=sc.next();
		JobSeeker obj1=new JobSeeker();
		if(obj1.valUser(username))
		{
			System.out.println("Valid UserName");
		}
		else
		{
			System.out.println("Not a valid UserName");
		}
		
		
		sc.close();

	}

}
