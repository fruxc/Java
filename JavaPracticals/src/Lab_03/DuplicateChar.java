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
public class DuplicateChar {
	void findDup(char[] x, int l) {
		for(int i = 1; i < l; i++) {
			for(int j = i+1; j < l; j++) {
				if(x[i]==x[j]) {
					System.out.print("\t"+x[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find duplicate characters :");
		String s = sc.nextLine();
		char[] st = s.toCharArray();
		DuplicateChar ds = new DuplicateChar();
		System.out.print("Duplicate characters are :");
		ds.findDup(st, s.length());
		sc.close();
	}
}
