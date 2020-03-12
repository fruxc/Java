/**
 * 
 */
package Lab_12;
/**
 * Imports
 */
import java.io.*;
import java.util.*; 
/**
 * @author HAMMAD
 *
 */
public class FilePractice {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to write into file:");
		String str = sc.nextLine();
		FileWriter fw = new FileWriter("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output.txt");
		int i = 0;
		while(i!=str.length()) {
			fw.write(str.charAt(i));
			i++;
		}
		System.out.println("Writing Completed!");
		fw.close();
		try { str = null;
			BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output.txt"));
			System.out.println("Output :");
			while ((str = fr.readLine()) != null) 
	            System.out.print(str);
			fr.close();
		}
		catch (FileNotFoundException fe) 
        { 
            System.out.println(fe); 
        }
		sc.close();
		FileInputStream in1 = new FileInputStream("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output.txt");
		FileInputStream in2 = new FileInputStream("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output2.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output3.txt");
		SequenceInputStream in3 = new SequenceInputStream(in1,in2);
		i = 0;
		while((i=in3.read())!=-1)
		{
			fout.write(i);
		}
		in1.close();
		in2.close();
		in3.close();
		fout.close();
		System.out.println();
		System.out.println("Combined 2 files output:");
		try { 
		str = null;
		BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\SPIT\\git\\javapracs\\src\\Lab_12\\Output3.txt"));
		System.out.println("Output :");
		while ((str = fr.readLine()) != null) 
            System.out.print(str);
		fr.close();
		}
		catch (FileNotFoundException fe)
		{
			System.out.println(fe);
		}
	}
}
