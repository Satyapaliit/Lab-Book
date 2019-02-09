package com.cg.Lab_8;
class ThreadRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread using Runnable... ");
	}
}

class ThreadExtend extends Thread
{
	public void run()
	{
		System.out.println("Thread using Thread...");
	}
}

public class ThreadDemo 
{
	

	public static void main(String[] args)
	{
		ThreadRunnable th1=new ThreadRunnable();
		ThreadExtend th2=new ThreadExtend();
		th2.start();
		Thread th3=new Thread(th1);
		Thread th4=new Thread(th1);
		th3.start();
		th4.start();
		

	}

}
