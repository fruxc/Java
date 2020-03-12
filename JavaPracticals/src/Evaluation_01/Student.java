/**
 * 
 */
package Evaluation_01;
/**
 * imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
class Student
{
	public int[] st_roll;
	public String[] st_name;
	public int[] st_marks;
	
	public void getdata(int n) {
		Scanner sc=new Scanner(System.in);
		st_roll = new int[n];
		st_name = new String[n];
		st_marks=new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("Enter students Details ");
			System.out.println("Enter Roll No:");
			st_roll[i]=sc.nextInt();
			System.out.println("Enter Name:");
			st_name[i] = sc.next();
			System.out.println("Enter Marks:");
			st_marks[i]=sc.nextInt();
		}
		sc.close();
	}

	public void showdata(int n) {
		for (int i=0;i<n;i++){
			System.out.println("Roll Number: "+st_roll[i]);
			System.out.println("Name: "+st_name[i]);
			System.out.println("Marks: " +st_marks[i]);
		}
	}
	
	public void sortAlpha(int n) { 
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (st_name[i].compareTo(st_name[j])>0)
				{
					String temp = st_name[i];
					st_name[i] = st_name[j];
					st_name[j] = temp;
				}
			}
		}
		
		System.out.print("Names in Alphabetic Order:\n");
		for (int i = 0; i < n - 1; i++)
		{
			System.out.print(st_name[i] +"\n");
		}
		System.out.print(st_name[n - 1]);
	}
	
	public void sortMarks(int n) {
		int size = n;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(st_marks[i] == st_marks[j] && i!=j) {
					if (st_name[i].compareTo(st_name[j])>0)
					{
						String temp = st_name[i];
						st_name[i] = st_name[j];
						st_name[j] = temp;
					}
				}
				else if(st_marks[i] > st_marks[j]) {
					int temp = st_marks[i];
					st_marks[i] = st_marks[j];
					st_marks[j] = temp;
				}
			}
		}
		System.out.println("Highest to lowest marks:");
		for (int i=0;i<n;i++){
			System.out.println("Marks: " +st_marks[i]+ "\t Name :" +st_name[i]);
		}
	}
	public static void main(String args[]){
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int n = a.nextInt();
		Student st = new Student();
		st.getdata(n);
		st.showdata(n);
		st.sortMarks(n);
		st.sortAlpha(n);
		a.close();
	}
}
