package com.cg.Lab_4;

import com.cg.Lab_2.Person;

public class SavingAccount extends Account
{
	
	
	public SavingAccount(double bal, Person per)
	{
		super(bal, per);
		// TODO Auto-generated constructor stub
	}
	
	
	public double withraw(double amt)
	{
		double rs;
		if(balance>=amt+min_bal)
		{
			balance=balance-amt;
			rs=amt;
		}
		else
		{
			
			System.out.println("You can't withraw that much amount!");
			rs=0;
		}
		return rs;
	}
	
	

	public static void main(String[] args)
	{
		SavingAccount sa=new SavingAccount(5000,new Person("Smith",22));
		sa.withraw(4000);
		System.out.println(sa.per.getFirst_Name()+"'s Account Updated Balance:Rs"+sa.getBalance());

	}

}
