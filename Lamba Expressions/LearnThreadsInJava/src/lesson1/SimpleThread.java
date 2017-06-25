package lesson1;

/*
 * This example will show how a basic thread implementation could be done
 * 
 * 
 */
class Runner extends Thread {
/*
 * We'll define a method that has a for loop that prints something on to the screen.
 */
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Hello "+i);

			try {
				// Sleep pauses the program the specified duration (in milliseconds)
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SimpleThread {

	public static void main(String[] args) {

		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
		
		Runner runner3 = new Runner();
		runner3.run();
	}

}
