/**
 * 
 */
package Lab_07;

/**
 * @author HAMMAD
 *
 */

public abstract class AbstractClass
{
	AbstractClass()
	{
		System.out.println("Abstract Class's Constructor Has Been Called.");
	}
	
	abstract void students();
}

class College extends AbstractClass
{
	College()
	{
		System.out.println("College Constructor Has Been Called.");
	}
	
	void students()
	{
		System.out.println("College Student Function()");
	}
}

class School
{
    public static void main(String args[])
    {
    	College d = new College();
    	d.students();
    }
}