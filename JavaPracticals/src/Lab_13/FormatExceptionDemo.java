/**
 * 
 */
package Lab_13;

import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class FormatExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter a number:");
			String s = sc.next();
			int num=Integer.parseInt (s) ;
			System.out.println(num);
		}
		catch(NumberFormatException ex) {
			System.err.println("Format Number Exception was caught: " + ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
	}
}
