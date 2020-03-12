/**
 * 
 */
package Lab_02;

/*
 * Imports 
 */

import java.util.Scanner;

/**
 * @author HAM12MAD
 *
 */
public class Fibonacci {
	public int en,res=0,a=1,b=1,c;
	Fibonacci(int x){
		this.en = x;
	}
	public void series() {
		for(int i=0; i<this.en; i++) {
			System.out.print(a+"\t");
			c = a+b;
			a = b;
			b = c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of the fibonacci series :");
		int fb = sc.nextInt();
		Fibonacci f = new Fibonacci(fb);
		f.series();
		sc.close();
	}

}
