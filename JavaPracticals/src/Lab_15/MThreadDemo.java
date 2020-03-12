/**
 * 
 */
package Lab_15;

import java.util.Scanner;

/**
 * @author HAMMAD
 *
 */
class MultiD extends Thread implements Runnable{
	String name;
	Thread t;
	MultiD (String thread){
    	name = thread;
    	t = new Thread(this, name);
    	System.out.println("New thread: " + t);
    	t.start();
    }
    
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running!");
			Thread.sleep(500);
			System.out.println("Sleeping "+name);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Exiting "+name);
		}
	}
}
public class MThreadDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter Thread Name:");
			s = sc.next();
			new MultiD(s);
		}
		sc.close();
	}
}
