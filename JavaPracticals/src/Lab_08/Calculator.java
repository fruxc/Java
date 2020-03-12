/**
 * 
 */
package Lab_08;

/**
 * Imports
 */
import Lab_08.Calculate;
import Lab_08.Subpackage.Multi;
import java.util.Scanner;

/**
 * @author HAMMAD
 *
 */
public class Calculator {
	public static void main(String args[]){
		int x,y;
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		Calculate obj = new Calculate();
		System.out.println("Addition Result = "+obj.add(x, y));
		Multi ob = new Multi();
		System.out.println("Multiplication Result = "+ob.mult(x, y));
		sc.close();
	}
}
