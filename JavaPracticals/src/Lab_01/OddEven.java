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
public class OddEven {

	public int k;
	public void oddEvenCheck() {
		
	    System.out.println("Input an integer number :");
	    Scanner sc = new Scanner(System.in);
	    k = sc.nextInt();   
	    if ((k/2)*2 == k)
	      System.out.println("Number is Even");
	    else
	      System.out.println("Number is Odd");
		sc.close();
	}
	
	public static void main(String[] args) {
		
		OddEven oe = new OddEven();
		oe.oddEvenCheck();
		
	}
}
