package com.cg.Lab_7;

import java.util.*;

public class Square
{
	public HashMap<Integer,Integer> getSquare(int[] numAr)
	{
		HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		for(int i=0;i<numAr.length;i++)
		{
			hashMap.put(numAr[i],(int)Math.pow(numAr[i],2));
		}
		
		return hashMap;
	}

	public static void main(String[] args)
	{
		int[] ar=new int[] {11,12,13,14,15,18,16,17,19};
		
		Square obj=new Square();
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm=obj.getSquare(ar);
		System.out.println(hm);
		
		//7.5
		List<String> arList=new ArrayList<String>();
		arList.add("Laptop");
		arList.add("Palmtop");
		arList.add("Mobile");
		arList.add("Earphone");
		arList.add("Backpack");
		arList.add("Headphone");
		System.out.println("----------Befor Sorting-----------");
		for(String product:arList)
		{
			System.out.println(product);
		}
		
		System.out.println("----------After Sorting-----------");
		Collections.sort(arList);
		for(String product:arList)
		{
			System.out.println(product);
		}
	}

}
