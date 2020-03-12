/**
 * 
 */
package Lab_11;
/**
 * Imports
 */
import java.util.*;
/**
 * @author HAMMAD
 *
 */
public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList <Integer> student = new ArrayList<Integer>();
		student.add(2018450001);
		student.add(2018450002);
		student.add(2018450003);
		student.add(2018450004);
		System.out.println(student);
		student.add(4, 2018450005);
		student.add(5, 2018450006);
		student.add(6, 2018450007);
		System.out.println(student);
		int size = student.size();
		System.out.println("Size of ArrayList: "+size);
		ArrayList<?> student2;
		student2 = (ArrayList<?>) student.clone();
		System.out.println(student2);
		System.out.println("Enter UID to search:");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		System.out.println(student.contains(s));
		student.clear();
		System.out.println(student);
		sc.close();
	}

}
