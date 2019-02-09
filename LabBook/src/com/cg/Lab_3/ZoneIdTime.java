package com.cg.Lab_3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneIdTime
{

	public static void main(String[] args)
	{
		System.out.println("Zone ID?:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Select:\n1-America/New_York\n2-Europe/London\n3-Asia/Tokyo\n4-US/Pacific\n5-Africa/Cairo\n6-Australia/Sydney");
		System.out.print("Your ans:");
		int choice=sc.nextInt();
		String zid=null;
		
		switch(choice)
		{
			case 1:
			{
				zid="America/New_York";
			}
			break;
			case 2:
			{
				zid="Europe/London";
			}
			break;
			case 3:
			{
				zid="Asia/Tokyo";
			}
			break;
			case 4:
			{
				zid="US/Pacific";
			}
			break;
			case 5:
			{
				zid="Africa/Cairo";
			}
			break;
			case 6:
			{
				zid="Australia/Sydney";
			}
			break;
		}
		
		System.out.println("Time in "+zid+" is: "+ZonedDateTime.now(ZoneId.of(zid)).getHour()+":"+ZonedDateTime.now(ZoneId.of(zid)).getMinute()+":"+ZonedDateTime.now(ZoneId.of(zid)).getMinute());
		
		
		
		sc.close();

	}

}
