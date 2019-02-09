package com.cg.Lab_4;

import com.cg.Lab_2.Person;

public class CurrentAccount extends Account
{
	private double overdraftlimit=2000;
	public CurrentAccount(double bal, Person per)
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
			double temp=balance;
			System.out.println("Low Balance!,Overdraft limit:Rs"+overdraftlimit);
			if(balance+overdraftlimit>=amt)
			{
				balance=0;
				overdraftlimit=overdraftlimit-amt+temp;
			}
			else
			{
				System.out.println("You can only overdraft upto:Rs"+overdraftlimit);
			}
			
			rs=0;
		}
		return rs;
	}
	
	
	

	public static void main(String[] args)
	{
		CurrentAccount ca=new CurrentAccount(5000,new Person("Kathy",20));
		ca.withraw(6400);
		System.out.println(ca.per.getFirst_Name()+"'s Account Updated Balance:Rs"+ca.getBalance()+"\nOverdraft limit:Rs"+ca.overdraftlimit);

	}

}
