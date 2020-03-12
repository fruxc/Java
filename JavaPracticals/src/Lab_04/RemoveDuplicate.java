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
public class RemoveDuplicate {

	public void removeDuplicateChar(String str, char[] ch) {
		int[] count = new int[ch.length];
		int total;
		for(int i = 0; i<str.length(); i++) {
			total = 0;
			for(int j = 0; j<str.length(); j++) {
				if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch[j]) && Character.toLowerCase(str.charAt(i)) != ' ') {
					total++;
				}
			}
			count[i]=total;
		}
		for(int i = 0; i<str.length(); i++) {
			if(count[i] == 1)
			{
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println("Removed Duplicate Character String:");
		rd.removeDuplicateChar(str, ch);
		sc.close();
	}

}
