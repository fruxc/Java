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
public class PrimeNumber {

	static boolean isPrime(int p) {
		for(int i = 2; i<=Math.sqrt(p); i++) {
			if((p%i) == 0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x = sc.nextInt();
		if(x == 2 || PrimeNumber.isPrime(x)) {
			System.out.println(x+" is a not prime number.");
		}
		else{
			System.out.println(x+" is a prime number.");
		}
		sc.close();
	}
}
