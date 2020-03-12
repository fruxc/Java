/**
 * 
 */
package Lab_10;
import java.util.*;

/**
 * @author HAMMAD
 *
 */
public class SinglyLinkedList {
	
	static class Node{
		public int data;
		Node next = null;
	}
	Node list = null;
	Node p;
	Node q;
	Node r;
	void insertB(int data)
	{
		if(list==null) 
		{
			p=new Node();
			p.data=data;
			p.next=null;
			list=p;
		}
		else 
		{
			p=new Node();
			p.data=data;
			p.next=list;
			list=p;
		}
	}
	
	void insertE(int data) {
		if(list==null)
		{
			p=new Node();
			p.data=data;
			p.next=null;
			list=p;
		}
		else
		{
			q=list;
			p=new Node();
			p.data=data;
			while(q.next!=null)
			{
				q=q.next;
			}
			q.next=p;
			p.next=null;
		}
	}
	
	void insertBefore(int search, int data)
	{
		if(list==null)
		{
			System.out.println("List is empty.");
		}
		else
		{
			q=list;
			r=list;
			while(q.data!=search && q.next!=null)
			{
				r=q;
				q=q.next;
			}
			if(q.data==search && q!=list) 
			{
				p=new Node();
				p.data=data;
				p.next=q;
				r.next=p;
			}
			if(q==list) 
			{
				insertB(data);
			}
			if(q.data!=search) 
			{
				System.out.println("Data not found.");
			}
		}
	}
	
	void insertAfter(int search, int data)
	{
		if(list==null)
		{
			System.out.println("List is empty.");
		}
		else
		{
			q=list;
			r=list;
			while(q.data!=search && q.next!=null)
			{
				q=q.next;
				r=q.next;
			}
			if(q.data==search && q!=list)
			{
				p=new Node();
				p.data=data;
				q.next=p;
				p.next=r;
				System.out.println("Element inserted ");
			}
			else if(q.data==search && q==list)
			{
				p=new Node();
				p.data=data;
				r=q.next; 
				q.next=p;
				p.next=r;
				System.out.println("Element inserted.");
			}
			else if(q.data!=search)
			{
				System.out.println("Data not found.");
			}
			else
			{
				System.out.println("Unknown issue.");
			}
		}
	}
	
	void deleteB()
	{
		if(list==null)
		{
			System.out.println("List is empty.");
		}
		else
		{
			q=list;
			System.out.println("Element deleted = "+list.data);
			list=list.next;
			q=null;
		}
	}
	
	void deleteE() {
		if(list==null) {
			System.out.println("List is empty.");
		}
		else
		{
			q = list;
			r = q;
			while(q.next!=null)
			{
				r=q;
				q=q.next;
			}
			if(r==list && q==list) {
				System.out.println("Element deleted = "+q.data);
				list = null;
			}
			else
			{
				r.next=null;
				System.out.println("Element deleted = "+q.data);
				q=null;
			}
		}
	}
	void display()
	{
		if(list==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			q=list;
			while(q!=null)
			{
				System.out.print(q.data+"\t");
				q=q.next;
				try
				{
					Thread.sleep(200); 
				}
				catch(Exception e)
				{}
			}
			System.out.println();
		}
	}
	void DeleteP(int pos)
	{
		if(list==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			q=list;
			r=q;
			while(q.data!=pos && q.next!=null)
			{
				r=q;
				q=q.next;
			}
			if(q==list && r==list)
			{
				list=list.next;
				q=null;
			}
			else if(q.data==pos)
			{
				r.next=q.next;
				q=null;
			}
			else if(q.next==null && q.data!=pos)
			{
				System.out.println("Element not found ");
			}
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		while(ch != 9) {	
			System.out.println("Enter Choice:");
			System.out.println("1) Insert at the beginning.");
			System.out.println("2) Insert at the end.");
			System.out.println("3) Insert before an element.");
			System.out.println("4) Insert after an element.");
			System.out.println("5) Delete at the beginning.");
			System.out.println("6) Delete at the end.");
			System.out.println("7) Delete particular element.");
			System.out.println("8) Display Linked List.");
			System.out.println("9) Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data to insert at the beginning:");
				myList.insertB(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter data to insert at the end:");
				myList.insertE(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter data to insert before an element:");
				myList.insertBefore(sc.nextInt(),sc.nextInt());
				break;
			case 4:
				System.out.println("Enter data to insert after an element:");
				myList.insertAfter(sc.nextInt(),sc.nextInt());
				break;
			case 5:
				System.out.println("Delete data at the beginning:");
				myList.deleteB();
				break;
			case 6:
				System.out.println("Delete data at the end:");
				myList.deleteE();
				break;
			case 7:
				System.out.println("Enter data to delete:");
				myList.DeleteP(sc.nextInt());
				break;
			case 8:
				System.out.println("LinkedList :");
				myList.display();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input!\nTry again!");
				break;
			}
		}
		sc.close();
	}
}
