/**
 * 
 */
package Lab_08;
/**
 * Imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class Calculate {
	public int add(int a, int b){
		return a+b;
	}
	
	public static void main(String args[]){
		int x,y;
		System.out.println("Enter two numbers to add:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		Calculate obj = new Calculate();
		System.out.println("Result = "+obj.add(x, y));
		sc.close();
	}
}