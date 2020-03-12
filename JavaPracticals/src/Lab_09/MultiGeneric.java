/**
 * 
 */
package Lab_09;

/**
 * @author HAMMAD
 *
 */

class Gen<T, U> 
{ 
	T obj1;
	U obj2;

	Gen(T obj1, U obj2) 
	{ 
		this.obj1 = obj1; 
		this.obj2 = obj2; 
	} 

	public void print() 
	{ 
		System.out.println(obj1); 
		System.out.println(obj2); 
	} 
} 

class MultiGeneric
{ 
	public static void main (String[] args) 
	{ 
		Gen <String, Integer> obj = new Gen<String, Integer>("Multiple Generic Program", 15); 

		obj.print(); 
	} 
}