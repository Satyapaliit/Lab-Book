package com.cg.Lab_7;


import java.util.*;

public class NumberReverse
{
	public int[] getSorted(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			StringBuilder sb=new StringBuilder();
			String str=Integer.toString(ar[i]);
			sb.append(str);
			sb.reverse();
			str=sb.toString();
			ar[i]=Integer.parseInt(str);
			
		}
		
		Arrays.sort(ar);
		
		return ar;
		
	}

	public static void main(String[] args)
	{
		int[] ar=new int[] {54,87,63,56,25};
		System.out.print("Before:");
		for(int aa:ar)
		{
			System.out.print(aa+" ");
		}
		NumberReverse obj=new NumberReverse();
		int[] a=obj.getSorted(ar);

		
		System.out.print("\nAfter:");
		for(int p:a)
		{
			System.out.print(p+" ");
		}

		
	}

}
