package com.cg.Lab_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarranteeCal
{

	public static void main(String[] args)
	{
		System.out.println("Purchase date(dd/mm/yyy)?:");
		Scanner sc=new Scanner(System.in);
		String purchaseDate=sc.nextLine();
		System.out.println("Warranty?(dd/mm/yy)");
		
		String warrantee=sc.nextLine();
		DateTimeFormatter wfmt=DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate wdate=LocalDate.parse(warrantee, wfmt);
		
		
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld=LocalDate.parse(purchaseDate, fmt);
		
		
		System.out.println("Warrantee will expire on: "+ld.plusYears(wdate.getYear()%100).plusMonths(wdate.getMonthValue()));
		
		
		sc.close();
	}

}
