/**
 * 
 */
package Lab_13;

import java.io.*;

/**
 * @author HAMMAD
 *
 */
public class IOExceptionDemo {
	public static void main(String[] args) {
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		try{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}
		catch (IOException ex){
            System.err.println("An IOException was caught: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}