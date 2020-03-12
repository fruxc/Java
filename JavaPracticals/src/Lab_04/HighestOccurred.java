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
public class HighestOccurred {
	
	public void checkHighestChar(String str, char[] ch) {
		int[] count = new int[ch.length];
		int total,max=0,pos=0;
		for(int i = 0; i<str.length(); i++) {
			total = 0;
			for(int j = 0; j<str.length(); j++) {
				if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch[j]) && Character.toLowerCase(str.charAt(i)) != ' ') {
					total++;
				}
			}
			if(total >= max) {
				max = total;
				pos = i;
			}
			count[i]=total;
		}
		System.out.print(str.charAt(pos));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		HighestOccurred ho = new HighestOccurred();
		System.out.println("Highest Occurred Character String:");
		ho.checkHighestChar(str, ch);
		sc.close();
	}


}
