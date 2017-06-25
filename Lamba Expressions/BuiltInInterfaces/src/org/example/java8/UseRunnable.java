package org.example.java8;

public class UseRunnable {

	public static void main(String[] args) {
		/*
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 1");
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 2");
			}
		};
		*/
		
		// The code above could be replaced by using Lambda expressions
		
		Runnable r1 = () -> System.out.println("This is thread1");
		Runnable r2 = () -> System.out.println("This is thread2");
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		/*
		 * When you run this code, the output may change, as the order in which the exection of the 
		 * threads is done or completed is completely arbitrary and Java decides it
		 * And multi-threading is for parallel execution.
		 * 
		 */
		
		// Lets try a lambda expression with a method body that has multiple lines
		
		Runnable r3 = () -> {
			// Delay this thread by 1000 ms or 1 second.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("This is thread3");
		};
		
		Runnable r4 = () -> System.out.println("This is thread4");
		
		new Thread(r3).start();
		new Thread(r4).start();
		
	}

}
