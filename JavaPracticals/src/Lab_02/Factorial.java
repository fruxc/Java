/**
 * 
 */
package Lab_02;
/*
 * Imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class Factorial {
	
	public int fact=1;
	public int factor(int x) {
		if(x>0) {
			fact = fact * x;
			x=x-1;
			factor(x);
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find it's factorial :");
		int f = sc.nextInt();
		Factorial fc = new Factorial();
		int res = fc.factor(f);
		System.out.println(res);
		sc.close();
	}

}