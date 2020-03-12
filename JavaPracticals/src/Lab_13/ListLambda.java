/**
 * 
 */
package Lab_13;

import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class ListLambda {
	public int i;
	public String s;
	
	ListLambda(List<String> l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 10 elements:");
		for(i=0; i<10; i++) {
			s = sc.nextLine();
			l.add(s);
		}
		sc.close();
	}
	public void Display(List<String> l) {
		System.out.println("Display using simple for loop:");
		Iterator<String> itr = l.iterator();
		for(i=0; i<10; i++) {
			System.out.println(itr.next());
		}
	}
	
	public void DisplayLambda(List<String> l) {
		System.out.println("Using lambda expression:");
		l.forEach(s->System.out.println(s));
	}
	
	public static void main(String[] args) {
		List<String> myList = new Vector<String>();
		ListLambda ob = new ListLambda(myList);
		ob.Display(myList);
		ob.DisplayLambda(myList);
	}

}
