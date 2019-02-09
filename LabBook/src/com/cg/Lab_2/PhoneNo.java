package com.cg.Lab_2;

public class PhoneNo
{
	//Lab 2.4
		String mobNo;
		
		public String getMobNo()
		{
			return mobNo;
		}


		public void setMobNo(String mobNo)
		{
			this.mobNo = mobNo;
		}
		
		public void displayPersonDetails(String firstName,String lastName,char gender)
		{
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
			System.out.println("Gender: "+gender);
		}
		

		
		public static void main(String a[])
		{
			
			PhoneNo obj2=new PhoneNo();
			obj2.setMobNo("7618515569");
			
			Person obj1=new Person("Satyapal","Kumar",'M');
			obj2.displayPersonDetails(obj1.getFirst_Name(),obj1.getLast_Name(),obj1.getGender());
			
			System.out.println("Mob No.: "+obj2.getMobNo());
			
		}
		
	
}
