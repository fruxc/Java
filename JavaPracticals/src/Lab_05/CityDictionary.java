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
public class CityDictionary {
 
	public static void sortDictionary(int n) {
		for(int i=0; i<n; i++) {
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = "";
		int n = sc.nextInt();
		char city[][] = new char[n][];
		for (int i = 0; i < n; i++) {
			data = sc.nextLine();
			if(i==1) {
				city[0] = data.toCharArray();
				data = sc.nextLine();
			}
		    city[i] = data.toCharArray();
		}
		System.out.println("Entered String:");
		for(int i = 0; i < n; i++) {
			System.out.println(city[i]);
		}
		sortDictionary(n);
		sc.close();
	}
}
