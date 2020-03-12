/**
 * 
 */
package Lab_03;
/*
 * imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();
		System.out.println(str1);
		sc.close();
	}

}
