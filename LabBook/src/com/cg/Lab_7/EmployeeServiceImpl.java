package com.cg.Lab_7;
import com.cg.Lab_5.Employee;


import java.util.*;
import java.util.Map.Entry;



public class EmployeeServiceImpl implements Comparator<Employee>
{
	List<Employee> list=new ArrayList<Employee>();
	
	
	HashMap<Integer,Employee> empRepo=new HashMap<Integer,Employee>();
	
	public void addEmployee(Employee emp)
	{
		empRepo.put(emp.getEmpid(), emp);
	}
	
	public void displayEmpDetails(String scheme)
	{
		for(Map.Entry<Integer, Employee> sch:empRepo.entrySet())
		{
			if(sch.getValue().getScheme(sch.getValue()).equals(scheme))
			{
				System.out.println(sch.getKey()+","+sch.getValue().getEmpname()+","+sch.getValue().getScheme(sch.getValue()));
				
			}
		}
		
	}
	public void deleteEmployeeWithUserId(int userId)
	{
		empRepo.remove(userId);
		
	}
	

	public static void main(String[] args)
	{
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		emp.addEmployee(new Employee(101,"Satyapal Kumar",25000));
		emp.addEmployee(new Employee(102,"Arun Kumar",880000));
		emp.addEmployee(new Employee(103,"Dinesh Kumar",7000));
		emp.addEmployee(new Employee(104,"Amit Kumar",84780000));
		emp.displayEmpDetails("Scheme_A");
		
	}
	public void sortBySalary()
	{
		
		for(Entry<Integer, Employee> m:empRepo.entrySet())
		{
			list.add((Employee) m);
		}
		Collections.sort(list, new EmployeeServiceImpl());
	}

	@Override
	public int compare(Employee o1, Employee o2)
	{
		
		return (int) (o1.getSalary()-o2.getSalary());
	}

}
