/**
 * 
 */
package Lab_01;

/**
 * @author HAMMAD
 *
 */
public class DisplayNumbers {

	public static void main(String[] args) {
		int i = 0;
		for(; i<=10; i++) {
			System.out.println(i);
		}
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		do {
			System.out.println(i);
			i++;
		}while(i<=30);
	}

}
