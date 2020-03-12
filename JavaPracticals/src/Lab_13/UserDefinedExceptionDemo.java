/**
 * 
 */
package Lab_13;

import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class UserDefinedExceptionDemo{
	public class DivideByZeroException extends ArithmeticException{
		
		private static final long serialVersionUID = 1L;
		
		String message;
	
		public DivideByZeroException(String message) {			
			this.message = message;
		}
		
		public String toString() {
			return (message);
		}
		
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int n,d,r;
		try {
			System.out.println("Enter numerator");
			n = sc.nextInt();
			System.out.println("Enter denomenator:");
			d = sc.nextInt();
			r = quotient(n,d);
			System.out.println("Result :"+r);
		}
		catch(DivideByZeroException ex) {
			System.out.println(ex.toString());
		}
		sc.close();
	}
	
	private int quotient(int n, int d) throws DivideByZeroException{
		if(d == 0) {
			throw new DivideByZeroException("You can't divide by zero");
		}
		return (n/d);
	}

	public static void main(String[] args) {
		{
			UserDefinedExceptionDemo demo = new UserDefinedExceptionDemo();
			demo.go();
		}
	}
}

