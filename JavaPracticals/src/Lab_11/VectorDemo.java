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
public class VectorDemo {
	int sal,age; String name;
	VectorDemo(int sal, int age, String name)
	{
		this.sal = sal;
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,a; String na;
		System.out.println("Enter name, age and salary of the employee:");
		na = sc.nextLine();
		a = sc.nextInt();
		s = sc.nextInt();
		VectorDemo vd = new VectorDemo(s,a,na);
		Vector<Object> n = new Vector<Object>();
		n.add("First Element");
		n.add("Gotham");
		n.add(5);
		n.add(null);			//Null Value
		System.out.println(n);
		n.add(vd.name); 		//Normal Object
		n.add(vd.age);
		n.add(vd.sal);
		System.out.println(n);
		n.add("Gotham");		//Duplicate Object
		
		Vector<Object> v1 = new Vector<Object>(2,10); //Initial Capacity and Increment
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(3);
		v1.add(2,"Hi");							//Adding at the index
		System.out.println(v1);
		System.out.println(v1.capacity());
        
        System.out.println(v1.elementAt(2));  	//return object at the particular index
        v1.remove(3);
        System.out.println(v1);
        sc.close();
	}

}
