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
public class ReverseNumber {

	public int rev=0, num, n1;
	ReverseNumber(int x){
		num = x;
	}
	public int reverse() {
		while(this.num!=0)
		{
			n1 = num % 10;
			rev = rev * 10 + n1;
			num = num / 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to perform reverse operation :");
		int x = sc.nextInt();
		ReverseNumber rs = new ReverseNumber(x);
		int res = rs.reverse();
		System.out.println(res);
		
		sc.close();
	}

}
