/**
 * 
 */

package Lab_01;

/*
 * Imports
 */

import java.util.*;

/**
 * @author HAMMAD
 *
 */

public class OddEvenRange {

	public int a=0, b=0;
	
	public void swap(int x, int y) {
		if(x>=y) {
			this.b = x;
			this.a = y;
		}
		else {
			this.b = y;
			this.a = x;
		}
		oddEvenCheck();
	}

	public void oddEvenCheck() { 
	    if ((this.a/2)*2 == this.a) {
	    	System.out.println("Even Series");
	    	printEvenOdd(this.a,this.b);
	    	System.out.println("Odd Series");
	    	printEvenOdd(this.a+1,this.b);
	    }
	    else{
	    	System.out.println("Odd Series");
	    	printEvenOdd(this.a,this.b);
	    	System.out.println("Even Series");
	    	printEvenOdd(this.a+1,this.b);
	    }
	}
	
	public void printEvenOdd(int cur, int limit){
	    if(cur > limit) {
	    	return;
	    }
	    System.out.println(cur);
	    printEvenOdd(cur + 2, limit);
	}
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		OddEvenRange rg = new OddEvenRange();
		rg.swap(x, y);
		sc.close();
	}

}
