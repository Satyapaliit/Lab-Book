package com.cg.Lab_5;

import java.util.Scanner;

import com.cg.eis.Exception.EmployeeException;

public class Employee
{
	private String empname;
	private int empid;
	
	
	private String scheme;
	
	public enum desig
	{
		System_Associate,Programmer,Manager,Clerk;
	}
	
	private desig designation;
	long salary;
	
	
	public Employee(int id, String name, long sal)
	{
		try
		{
			if(sal<3000)
			{
				throw new EmployeeException("Salary not acceptable!");
			}
			
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		this.setEmpid(id);
		this.setEmpname(name);
		this.setSalary(sal);
		
		if(sal<=5000)
		{
				this.setDesignation(desig.Clerk);
				this.scheme="No_Scheme";
		}
		else
		{
			if(sal>5000&&sal<=20000)
			{
				this.setDesignation(desig.System_Associate);
				this.scheme="Scheme_C";
			}
			else
			{
				if(sal>20000&&sal<=40000)
				{
					this.setDesignation(desig.Programmer);
					this.scheme="Scheme_B";
				}
				else
				{
					this.setDesignation(desig.Manager);
					this.scheme="Scheme_A";
				}
				
			}
		}
		
		
		
		
		
		
		
	}
		
		
	
	public void setScheme(Employee emp)
	{
		if(emp.getDesignation().equals(desig.Clerk))
		{
			this.scheme="No_Scheme";
		}
		else
		{
			if(emp.getDesignation().equals(desig.Manager))
			{
				this.scheme="Scheme_A";
			}
			else
			{
				if(emp.getDesignation().equals(desig.System_Associate))
				{
					this.scheme="Scheme_C";
				}
				else
				{
					this.scheme="Scheme_B";
				}
			}
		}
		
		
	}
	public String getScheme(Employee emp)
	{
		return emp.scheme;
	}

	

	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public desig getDesignation() {
		return designation;
	}



	public void setDesignation(desig designation) {
		this.designation = designation;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}

	

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Employee Id?:");
	int id=sc.nextInt();
	
	String s=sc.nextLine();
	System.out.print(s);
	
	System.out.print("Employee name?:");
	String name =sc.nextLine();
	
	System.out.print("Salary?:");
	long salry=sc.nextLong(10);
	
	
	Employee emp=new Employee(id,name,salry);
	emp.setScheme(emp);
	
	System.out.println(emp.getEmpname()+" ["+"Designation:"+emp.getDesignation()+",EmpId:"+emp.getEmpid()+"] applicable for:"+emp.getScheme(emp)+".");

	sc.close();
}
	

}
