/**
 * 
 */
package Lab_05;
/**
 * imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class pattern {

	/**
	 * 
	 */
	public pattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n-2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		new pattern(n);
		sc.close();
	}

}
