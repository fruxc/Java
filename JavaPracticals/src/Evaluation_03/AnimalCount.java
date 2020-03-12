/**
 * 
 */
package Evaluation_03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * @author HAMMAD
 *
 */
public class AnimalCount {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to write into file:");
		String str = sc.nextLine();
		FileWriter fw = new FileWriter("C:\\Users\\SPIT\\git\\javapracs\\src\\Evaluation_03\\Animal.txt");
		int i = 0;
		while(i!=str.length()) {
			fw.write(str.charAt(i));
			i++;
		}
		System.out.println("Writing completed");
		fw.close();
		try {
			Integer counter = 0;
			i = 0;
			str = null;
			BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\SPIT\\git\\javapracs\\src\\Evaluation_03\\Animal.txt"));
			while ((str = fr.readLine()) != null) {
				i=0;
				while(i != str.length()) {
					if(str.charAt(i) == ' '){
						counter++;
					}
					i++;
				}
			}
			counter = counter + 1;
			String s = counter.toString();
			FileWriter fw2 = new FileWriter("C:\\Users\\SPIT\\git\\javapracs\\src\\Evaluation_03\\AnimalCount.txt");
			fw2.write(s);
			System.out.println(counter);
			fw2.close();
			fr.close();
		}
		catch (FileNotFoundException fe) 
		{
			System.out.println(fe); 
		}
		sc.close();
	}
}
