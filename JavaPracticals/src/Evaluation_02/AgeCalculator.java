/**
 * 
 */
package Evaluation_02;

import java.text.*;
import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class AgeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date cur = new Date();
		DateFormat fordate = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat foryear = new SimpleDateFormat("yyyy");
		System.out.println("Current Date "+fordate.format(cur));
		int curd = Integer.parseInt(foryear.format(cur));
		System.out.println("Current Year "+curd);
		System.out.println("Enter you date of birth in the form of dd/MM/yyyy");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Entered date of birth : "+d+"/"+m+"/"+y);
		System.out.println("You are "+(curd-y)+" years old.");
		sc.close();
	}

}
