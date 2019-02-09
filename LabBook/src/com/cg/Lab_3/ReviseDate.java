package com.cg.Lab_3;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ReviseDate
{

	public static void main(String[] args)
	{
		ZonedDateTime zdtInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Zone:"+zdtInParis.getZone()+", Time:"+zdtInParis.getHour()+":"+zdtInParis.getMinute()+":"+zdtInParis.getSecond()+":"+zdtInParis.getNano());
		LocalDate ld=LocalDate.of(1998,Month.FEBRUARY,2);
		System.out.println("Date:"+ld);

	}

}
