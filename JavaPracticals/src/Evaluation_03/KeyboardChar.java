/**
 * 
 */
package Evaluation_03;

import java.util.Scanner;

/**
 * @author HAMMAD
 *
 */
public class KeyboardChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			while(true) {
				System.out.println("Enter a number:");
				String s = sc.next();
				int num=Integer.parseInt (s) ;
				System.out.println(num);
			}
		}
		catch(NumberFormatException ex) {
			System.err.println("You have entered a character: " + ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
	}
}
