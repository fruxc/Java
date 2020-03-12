/**
 * 
 */
package Lab_13;

import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class ArrayExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		try {
			System.out.println("Want to insert elements at which position?");
			int s = sc.nextInt();
			arr[s] = sc.nextInt();
			System.out.println("Successfully Inserted.");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Index out of bound was caught: " + ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
	}
}