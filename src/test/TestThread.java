package test;

//Java program to demonstrate thread states 
class thread implements Runnable 
{ 
	public void run() 
	{ 
		System.out.println("Inside Run class thread");
		// moving thread2 to timed waiting state 
		try
		{ 
			Thread.sleep(1500); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		
		System.out.println("State of thread1 while it called join() method on thread2 -"+ 
			TestThread.thread1.getState()); 
		try
		{ 
			Thread.sleep(200); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		}	 
	} 
} 

public class TestThread implements Runnable 
{ 
	public static Thread thread1; 
	public static TestThread obj; 
	
	public static void main(String[] args) 
	{ 
		obj = new TestThread(); 
		thread1 = new Thread(obj); 
		thread1.setName("thread1");
		
		// thread1 created and is currently in the NEW state. 
		System.out.println("State of thread1 after creating it - " + thread1.getState()); 
		thread1.start(); 
		
		// thread1 moved to Runnable state 
		System.out.println("State of thread1 after calling .start() method on it - " + 
			thread1.getState()); 
	} 
	
	public void run() 
	{ 
		System.out.println("inside run class TestThread");
		thread myThread = new thread(); 
		Thread thread2 = new Thread(myThread); 
		thread2.setName("thread2");
		
		// thread1 created and is currently in the NEW state. 
		System.out.println("State of thread2 after creating it - "+ thread2.getState()); 
		thread2.start(); 
		
		// thread2 moved to Runnable state 
		System.out.println("State of thread2 after calling .start() method on it - " + 
			thread2.getState()); 
		
		// moving thread1 to timed waiting state 
		try
		{ 
			//moving thread1 to timed waiting state 
			Thread.sleep(200); 
			/*
			 * System.out.println("State of after calling Thread.sleep() ThreadName: "+
			 * Thread.currentThread().getName() + " state : " +
			 * Thread.currentThread().getState() );
			 */
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("State of thread2 after calling .sleep() method on it - "+ 
			thread2.getState() ); 
		
		
		try
		{ 
			// waiting for thread2 to die 
			thread2.join(); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("State of thread2 when it has finished it's execution - " + 
			thread2.getState()); 
		System.out.println("State of thread1 after thread2 terminates - " + TestThread.thread1.getState());
	} 
	
} 

