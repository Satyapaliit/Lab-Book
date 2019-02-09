package com.cg.Lab_3;

import java.util.*;

public class StringOperations
{
	public String stringOpr(String str0,int option)
	{
		String str2=str0;
		Scanner sc=new Scanner(System.in);
		
		switch(option)
		{
			case 1:
			{
				System.out.print("String to add?:");
				
				String str1=sc.nextLine();
				
				str2=str2+str1;
				
			}
			break;
			case 2:
			{
				StringBuilder sb=new StringBuilder();
				sb.append(str2);
				for(int i=1;i<=str2.length();i+=2)
				{						
					sb.setCharAt(i, '#');						
				}
				str2=sb.toString();
				
			}
			break;
			case 3:
			{
				StringBuilder sb=new StringBuilder();
				sb.append(str2);
				int length=sb.length();
				for(int i=0;i<length-1;i++)
				{
					for(int j=i+1;j<length;j++)
					{
						if(sb.charAt(i)==sb.charAt(j)||sb.charAt(i)==sb.charAt(j)+32||sb.charAt(i)==sb.charAt(j)-32)
						{
							sb.setCharAt(j,' ');
						}
					}
				}
				str2=sb.toString();
				str2=str2.replaceAll("\\s+","");
				
				
			}
			break;
			case 4:
			{
				StringBuilder sb=new StringBuilder();
				sb.append(str2);
				int lengthStr=sb.length();
				for(int i=1;i<lengthStr;i+=2)
				if(sb.charAt(i)>65)
				{
					sb.setCharAt(i,(char)(sb.charAt(i)-32));
				}
				str2=sb.toString();
				
			}
			break;
			case 5:
			{
				System.exit(0);
			}
			break;
			default:
			{
				System.out.println("Wrong choice\n");
			}
			
			
		}
		sc.close();
		return str2;
		
	}
	

	public static void main(String[] args)
	{
		System.out.println("String Operations:\n------------------");
		
		System.out.print("String?:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
			
		
			System.out.println("Press:\n1-Add\n2-Replace odd position with #\n3-remove duplicate characters\n4-Change odd place character to upper case");
			System.out.print("5-Exit\n");
			
			int choice=sc.nextInt();
						
			StringOperations obj1=new StringOperations();
			System.out.println("The result is:"+obj1.stringOpr(str, choice));
			
		
		
		sc.close();
		
		
	}

	
}
