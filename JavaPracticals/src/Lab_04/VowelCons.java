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
public class VowelCons {
	public void checkConsVowel(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		char[] vowel = new char[str.length()];
		char[] cons = new char[str.length()];
		int k=0,j=0;
		for(char i : ch) {
			if(i == ' ') {
				continue;
			}
			else if(i == 'a' || i == 'i' || i == 'o' || i == 'o' ||i == 'e') {
				vowel[k]=i;
				System.out.println("Vowel "+vowel[k]+" is found");
				k++;
			}
			else {
				cons[j]=i;
				System.out.println("Consonant "+cons[j]+" is found");
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		VowelCons vc = new VowelCons();
		vc.checkConsVowel(str);
		sc.close();
	}
}
