/**
 * 
 */
package Lab_12;

import java.io.*;
import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class EncryptFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to write into file:");
		String str = sc.nextLine();
		FileWriter fw = new FileWriter("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Normal.txt");
		int i = 0;
		while(i!=str.length()) {
			fw.write(str.charAt(i));
			i++;
		}
		FileWriter fw2 = new FileWriter("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Encrypt.txt");
		i = 0;
		while(i!=str.length()) {
			fw2.write((char)((int)(str.charAt(i))+4));
			i++;
		}
		System.out.println("Writing Completed!");
		fw.close();
		fw2.close();
		sc.close();
		
		try {
			str = null;
			BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output.txt"));
			System.out.println("Output :");
			i = 0;
			while ((str = fr.readLine()) != null) 
            System.out.print((char)((int)(str.charAt(i)-4)));
			i++;
			fr.close();
			}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
			}
	}

}
