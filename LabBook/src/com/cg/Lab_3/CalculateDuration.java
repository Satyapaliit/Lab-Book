package com.cg.Lab_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateDuration
{
	LocalDate systemdate,userDate;
	

	public static void main(String[] args)
	{
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc =new Scanner(System.in);
		System.out.print("Date?(dd/mm/yyy):");
		
		CalculateDuration obj1=new CalculateDuration();
		String str1=sc.nextLine();
		obj1.userDate=LocalDate.parse(str1, fmt);
		System.out.println(obj1.userDate);
		System.out.println(LocalDate.now());
		Period dur=Period.between(obj1.userDate,LocalDate.now());
		System.out.println("Duration: "+dur.getYears()+" Years, "+dur.getMonths()+" Months, "+dur.getDays()+" Days.");

		sc.close();
	}

}
