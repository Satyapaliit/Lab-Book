package com.cg.Lab_7;

import java.util.*;

public class ListRemoval
{
	public List<String> removeElement(List<String> list1,List<String> list2)
	{
		list1.removeAll(list2);		
		
		
		
		return list1;
		
	}

	public static void main(String[] args)
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Satyapal");
		l1.add("Rahul");
		l1.add("Ram");
		l1.add("Shyam");
		l1.add("Rama");
		l1.add("Summit");
		
		
		List<String> l2=new ArrayList<String>();
		l2.add("Satyapal");
		l2.add("Rahul");
		
		ListRemoval obj=new ListRemoval();
		List<String> resultList=obj.removeElement(l1, l2);
		for(String name:resultList)
		{
			System.out.println(name);
		}

	}

}
