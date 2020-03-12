/**
 * 
 */
package Lab_09;

/**
 * @author HAMMAD
 *
 */
class Test<T> 
{ 
	T obj;
	Test(T obj) { 
		this.obj = obj; 
	}
	
	public T getObject() {
		return this.obj; 
	}
}

class SimpleGeneric 
{
	public static void main (String[] args)
	{
		Test <Integer> Obj = new Test<Integer>(15);
		System.out.println(Obj.getObject());
		Test <String> sObj = new Test<String>("Generic Class String Input");
		System.out.println(sObj.getObject());
	} 
}
