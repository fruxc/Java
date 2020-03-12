
package Lab_13;

import java.util.*;

/**
 * @author HAMMAD
 *
 */

public class StudentException {
	public int i;
	public String s;
	public class StudentNotFound extends Exception{
		
		private static final long serialVersionUID = 1L;
		
		String message;
	
		public StudentNotFound(String message) {			
			this.message = message;
		}
		
		public String toString() {
			return (message);
		}
		
	}

	public void createList(List<String>l){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 2 Students:");
		for(i=0; i<2; i++) {
			s = sc.nextLine();
			l.add(s);
		}
	}
	
	public void searchStudent(List<String> l) {
		Scanner sr = new Scanner(System.in);
		try {
			System.out.println("Enter name to search:");
			s = sr.nextLine();
			String r = findStudent(l,s);
			System.out.println(r);
		}
		catch(StudentNotFound ex) {
			System.out.println(ex.toString());
		}
		sr.close();
	}
	
	private String findStudent(List<String> l, String s2) throws StudentNotFound {
		if(!l.contains(s)) {
			throw new StudentNotFound("Student is not present in the list");
		}
		return "Found";
	}

	public static void main(String[] args) {
		List<String> myList = new Vector<String>();
		StudentException se = new StudentException();
		se.createList(myList);
		se.searchStudent(myList);
	}

}
