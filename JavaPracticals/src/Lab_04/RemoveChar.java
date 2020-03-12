/**
 * 
 */
package Lab_04;

/**
 * imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class RemoveChar {
	public void removeChar(String str, char ch) {
		char[] s = str.toCharArray();
		for(char i : s) {
			if(i == ch)
			{
				continue;
			}
			else {
				System.out.print(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0);
		RemoveChar rd = new RemoveChar();
		System.out.println("Removed Character String:");
		rd.removeChar(str, ch);
		sc.close();
	}

}
