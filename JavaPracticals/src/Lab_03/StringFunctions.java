/**
 * 
 */
package Lab_03;
/**
 * Imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class StringFunctions {
	public int s=0;
	private int lengthOfString(char[] ch) {
		for (@SuppressWarnings("unused") char i : ch) {
			this.s++;
	      }
		return this.s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING :");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		StringFunctions sf = new StringFunctions();
		System.out.println("Length of string is "+sf.lengthOfString(ch));
		System.out.println("Reverse of the string = "+new String(sf.reverseString(ch)));
		System.out.println("String is palindrome?\n "+sf.checkPalindrome(str,new String(sf.reverseString(ch))));
		sf.concatString();
		sc.close();
	}

	private void concatString() {
		// TODO Auto-generated method stub
		
	}

	private String checkPalindrome(String str, String str1) {
		String res;
		int j = 0,cnt = 0;
		char [] temp = str.toCharArray();
		char [] temp1 = str1.toCharArray();
		for(int i=0;i<this.s-1; i++) {
			if(temp1[j]!=temp[i])
			{
				cnt++;
				break;
			}
			j++;
		}
		if(cnt>0)
		{
			res = "NO";
		}
		else {
			res = "YES";
		}
		return res;
	}

	private char[] reverseString(char[] ch) {
		char[] rev = new char[this.s];
		int j=0;
		for(int i=this.s-1; i>=0; i--) {
			rev[j]=ch[i];
			j++;
		}
		return rev;
	}

}
