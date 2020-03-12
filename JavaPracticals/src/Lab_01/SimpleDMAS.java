/**
 * 
 */
package Lab_01;

/**
 * Imports
 */
import java.util.*;
/**
 * @author HAMMAD
 *
 */
public class SimpleDMAS {

	public int res;

	public int div(int x, int y) {
		if(y>0) {
		res = x/y;
		return res;
		}
		else {
			System.out.println("2nd element is less than zero!!!");
			return 0;
		}
	}

	public int mul(int x, int y) {
		res = x*y;
		return res;
	}
	
	public int add(int x, int y) {
		res = x+y;
		return res;
	}
	
	public int sub(int x, int y) {
		res = x-y;
		return res;
	}
	
	public static void main(String[] args) {
		SimpleDMAS sd = new SimpleDMAS();
		Scanner sc = new Scanner(System.in);
		int ch,a,b;
		System.out.println("Enter Two Numbers To Perform DMAS");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Addition ="+sd.add(a, b));
			break;
		case 2:
			System.out.println("Subtraction ="+sd.sub(a, b));
			break;
		case 3:
			System.out.println("Multiplication ="+sd.mul(a, b));
			break;
		case 4:
			System.out.println("Division ="+sd.div(a, b));
			break;
		default:
			System.out.println("Wrong Choice!!!");
			break;
		}
		sc.close();
	}
}
