/**
 * 
 */
package Lab_07;

/**
 * @author HAMMAD
 *
 */
public final class FinalClass extends CollegeTest{
	public FinalClass() {
		System.out.println("We are in Final.");
	}
	void greetings() {
		System.out.println("Best Of Luck!!!");
	}
}

class CollegeTest{
	void students()
	{
		System.out.println("Test For Students!!! Function()");
	}
}

class SchoolTest
{
    public static void main(String args[])
    {
    	FinalClass d = new FinalClass();
    	d.greetings();
    	d.students();
    }
}