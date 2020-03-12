/**
 * 
 */
package Evaluation_03;

import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class VoteEligible {

	public int i,k;
	public String s;
	public class NotEligible extends Exception{
		
		private static final long serialVersionUID = 1L;
		
		String message;
	
		public NotEligible(String message) {			
			this.message = message;
		}
		
		public String toString() {
			return (message);
		}
		
	}

	public void createVoter(HashMap<String,Integer>l){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 2 Citizens:");
		for(i=0; i<2; i++) {
			s = sc.next();
			k = sc.nextInt();
			l.put(s, k);
		}
	}
	
	public void searchAge(HashMap<String, Integer> l) {
		Scanner sr = new Scanner(System.in);
		try {
			System.out.println("Enter name to search for eligible age:");
			s = sr.next();
			k = l.get(s);
			String r = findAge(l,k);
			System.out.println(r);
		}
		catch(NotEligible ex) {
			System.out.println(ex.toString());
		}
		sr.close();
	}
	
	private String findAge(HashMap<String,Integer> l, int k) throws NotEligible {
		if(k < 18) {
			throw new NotEligible("Voter age should be more than or equal to 18!");
		}
		return "Eligible";
	}

	public static void main(String[] args) {
		HashMap<String, Integer> myList = new HashMap<String, Integer>();
		VoteEligible se = new VoteEligible();
		se.createVoter(myList);
		se.searchAge(myList);
	}


}
