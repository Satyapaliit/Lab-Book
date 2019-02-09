package com.cg.Lab_7;


//import java.util.*;

public class StringOpr
{
	

	public void StrOpr(String s1,String s2)
	{
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		sb2.append(s2);
		int l=s1.length();
		
		//7.2.1
		for(int i=1;i<l;i=i+2)
		{
			sb1.append(s1.charAt(i-1));
			sb1.append(s2);				
		}
		System.out.println(sb1);
		
		//7.2.2
		if(sb1.indexOf(s2)==sb1.lastIndexOf(s2))
		{
			sb1.append(s2);
		}
		else
		{
			sb1.replace(sb1.lastIndexOf(s2), sb1.lastIndexOf(s2)+s2.length(), sb2.reverse().toString());
			sb2.reverse();
			
		}
		System.out.println("7.2.2:"+sb1);
		
		//7.2.3
		if(sb1.indexOf(s2)!=sb1.lastIndexOf(s2))
		{
			sb1.replace(sb1.indexOf(s2), sb1.indexOf(s2)+s2.length(), "");
		}
		System.out.println(sb1);
		
		//7.2.4
		StringBuilder sb3=new StringBuilder();		
		float f=sb2.length();
		sb3.append(sb2.subSequence(0, (int)Math.ceil(f/2))).append(s1).append(sb2.subSequence((int)Math.ceil(f/2), (s2.length())));
		System.out.println("7.2:"+sb3);
		
		//7.2.5
		
		System.out.println("S1:"+sb1+"\nS2:"+sb2);		
		char c='*';
		for(int j=0;j<sb2.length();j++)
		{
			for(int i=0;i<sb1.length();i++)
			{	
				System.out.println(i);
				if(sb2.charAt(j)==sb1.charAt(i))
				{
					sb1.setCharAt(i,c);
					System.out.println(sb1+":"+i);
				}
			}
		}

		
		
		System.out.println(sb1);
		
		
		//return (ArrayList<String>) arlist;
	}

	public static void main(String[] args)
	{
		String s1="kuldeekp",
				s2="XY";
		
		StringOpr obj=new StringOpr();
		obj.StrOpr(s1,s2);
		
		
	}

}
