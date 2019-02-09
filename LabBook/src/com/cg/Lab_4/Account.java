package com.cg.Lab_4;
import com.cg.Lab_2.*;

import java.util.Random;


public class Account
{
	static double min_bal=500;
	private long accNum;
	protected double balance;
	Person per;
	
	public Account(double bal,Person per)
	{
		this.per=per;
		Random rnd=new Random();
		long ac1=rnd.nextLong()*100000000;
		if(ac1<0)
		{
			ac1=ac1*(-1);
		}
		accNum=ac1%100000000;		
		balance=bal;
		System.out.println("A/c No.: "+accNum);
		
				
		
	}
	
	
	
	
	@Override
	public String toString()
	{
		return "Account [accNum=" + accNum + ", balance=" + balance + ", Person=" + per+ "]";
	}
	



	public double getBalance()
	{
		return balance;
	}
	
		
	public void deposit(double amt)
	{
		balance=balance+amt;
	}
	
	
	public double withraw(double amt)
	{
		
			balance=balance-amt;
			return amt;
	}
	
	public static void main(String[] args)
	{
		
		
		Account smith=new Account(2000,new Person("Smith",22));		
		System.out.println("A/c Balance:"+smith.getBalance());
		System.out.println("--------------------------");
		
		Account cathy=new Account(3000,new Person("Cathy",21));		
		System.out.println("A/c Balance:"+cathy.getBalance());
		System.out.println("--------------------------");

		
		cathy.deposit(2000);
		System.out.println("Cathy's Updated A/c Balance:"+cathy.getBalance());
		
		System.out.println("--------------------------");
		
		smith.deposit(2000);
		System.out.println("Smith's Updated A/c Balance:"+smith.getBalance());
			
		System.out.println("\n-------Using toString()----------");
		System.out.println("");
		System.out.println(smith);
		System.out.println("--------------------------");
		System.out.println(cathy);
		
		
		
		

	}










}
