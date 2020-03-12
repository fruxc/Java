/**
 * 
 */
package Lab_11;
/**
 * Imports
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class HashMapImple {
	static HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	
	public static void add(int k,String s) {
		hmap.put(s,k);
	}
	
	public static void clear() {
		hmap.clear();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void remove(int k) {
		hmap.remove(k);
		System.out.println("Removed from the map");
	
	}
	public static void search(String s) {
		if (hmap.containsKey(s)) {
            Integer a = hmap.get(s); 
            System.out.println("value for key "+ s +" is:- "+ a); 
        }
	}
	
	public static void print() { 
		Map<String, Integer> map = hmap;
		if(map.isEmpty()) {
			System.out.println("Map is empty");
		}
		else
		{
			System.out.println(map);
		}
	}
	
	public static void size() {
		System.out.println("Size of the map is "+hmap.size());
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch!=7) {
			System.out.println("1. Add value \n2. Search value \n3. Print Map\n4. Size of map\n5. Remove\n6. Clear Map\n7. Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter key");
				int k = sc.nextInt();
				System.out.println("Enter value");
				String s = sc.next();
				add(k,s);
				break;
			case 2:
				System.out.println("Enter value to search");
				s = sc.next();
				search(s);
				break;
			case 3: 
				print();
				break;
			case 4:
				size();
				break;
			case 5:
				System.out.println("Enter key to remove:");
				k = sc.nextInt();
				remove(k);
				break;
			case 6: 
				clear();
				break;
			case 7: 
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice choose again");
				break;
			}
		}
		sc.close();
	}
}
