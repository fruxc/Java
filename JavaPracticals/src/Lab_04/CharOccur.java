/**
 * 
 */
package Lab_04;
/**
 * Imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class CharOccur {
	public void charOccurrence(String string, char[] all_chars) {
	int[] count=new int[all_chars.length];
	int total=0;
	for(int i = 0 ; i < all_chars.length ; i++)
	{
		total=0;
		for(int j = 0 ; j < all_chars.length ; j++ )
		{
			if(Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(all_chars[j]))
			{
				total++;
			}
		}
		count[i]=total;
	}

	boolean flag=false; // false = that character is not present again

	for(int i = 0 ; i < all_chars.length ; i++ )
	{
		flag=false;
		for(int j = 0 ; j < i ; j++ )
		{
			if(Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(all_chars[j]))
			{
				flag=true;
				break;
			}
		}
		if(flag)
			continue;
		else
			System.out.println(all_chars[i] + " = " + count[i]);
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner( System.in );
	String string=sc.nextLine();

	char[] all_chars=string.toCharArray();
	CharOccur co = new CharOccur();
	co.charOccurrence(string, all_chars);
	sc.close();
}
}
