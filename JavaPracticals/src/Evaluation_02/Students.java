/**
 * 
 */
package Evaluation_02;

import java.util.Scanner;

/**
 * @author HAMMAD
 *
 */
class StudentData{
	int rollno;
	String name;
	void getName(String Name) {
		this.name = Name;
	}
	
	void getRollno(int rollno) {
		this.rollno = rollno;
	}
}
class Marks extends StudentData{
	int s1,s2,s3;
	void getMarks(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
}
class Addition extends Marks{
	int res;
	int result() {
		this.res = super.s1 + super.s2 + super.s3;
		return this.res;
	}
}
class compareMarks extends Addition{
	static int compared(int res1, int res2)
	{
		if(res1>res2) {
			return 1;
		}
		else {
			return 2;
		}
	}
}
public class Students extends compareMarks{
	
	public static void main(String[] args) {
		int s1,s2,s3,rollno;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of first student:");
		System.out.println("Enter Name of the Student");
		name = sc.nextLine();
		System.out.println("Enter Roll no of the Student");
		rollno = sc.nextInt();
		System.out.println("Enter Marks in subject 1");
		s1 = sc.nextInt();
		System.out.println("Enter Marks in subject 2");
		s2 = sc.nextInt();
		System.out.println("Enter Marks in subject 3");
		s3 = sc.nextInt();
		Students st = new Students();
		st.getName(name);
		st.getRollno(rollno);
		st.getMarks(s1, s2, s3);
		System.out.println("Total marks of "+st.name+" = "+st.result());
		System.out.println("Enter details of second student:");
		System.out.println("Enter Name of the Student");
		name = sc.next();
		System.out.println("Enter Roll no of the Student");
		rollno = sc.nextInt();
		System.out.println("Enter Marks in subject 1");
		s1 = sc.nextInt();
		System.out.println("Enter Marks in subject 2");
		s2 = sc.nextInt();
		System.out.println("Enter Marks in subject 3");
		s3 = sc.nextInt();
		Students st2 = new Students();
		st2.getName(name);
		st2.getRollno(rollno);
		st2.getMarks(s1, s2, s3);
		System.out.println("Total marks of "+st2.name+" = "+st2.result());
		System.out.println("Student "+compared(st.res,st2.res)+" has greater marks ");
		sc.close();
	}

}
