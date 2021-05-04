import java.io.*;

public class LinkedList {

	Node head=null; 
	int size=0; 

	class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void delete(  int key)
    {
        Node temp = this.head, prev = null;
        if (temp != null && temp.data == key) {
            this.head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
 
        prev.next = temp.next;
    }

	void insert( int data)
	{
		Node  newNode = new Node(data);
	    	newNode.next = null;
		if (this.head == null) {
			this.head =  newNode;
		}
		else {
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next =  newNode;
		}
	}
//0-indexed
	void deleteNodeAt( int position)
    {
        if (this.head == null)
            return;
        Node temp = this.head;
        if (position == 0)
        {
            this.head = temp.next;  
            return;
        }
  
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
          if (temp == null || temp.next == null)
            return;
  
        Node next = temp.next.next;
  
        temp.next = next;  
    }

 	Node middle()
    {
        Node slowPtr = this.head;
        Node fastPtr = this.head;
        if (head != null)
        {
            while (fastPtr != null && fastPtr.next != null)
            {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
        }            return slowPtr;
    }
 

    void printMiddle()
    {
        Node slowPtr = head;
        Node fastPtr = head;
        if (head != null)
        {
            while (fastPtr != null && fastPtr.next != null)
            {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            System.out.println("The middle element is [" +
                                slowPtr.data + "] \n");
        }
    }
 
     void reverse( )
    {	Node node=this.head;
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        this.head=node;
        
    }

	 void printList()
	{
		Node currNode = this.head;
	
		System.out.print("LinkedList: ");
		while (currNode != null) {
		System.out.print(currNode.data + " ");
		currNode = currNode.next;
		}
	}
	

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		 list.insert( 1);
		 list.insert( 2);
		 list.insert( 3);
		 list.insert( 4);
		 list.insert( 5);
		 list.insert( 6);
		 list.insert( 7);
		 list.insert( 8);
		 list.delete( 8);
		 list.deleteNodeAt( 4);
		list.reverse();

		// Print the LinkedList
		list.printList();
	}
}
