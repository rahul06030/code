	import java.lang.*;
	import java.util.*;
	import java.io.*;

class Run{

	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		Scanner sc=new Scanner(System.in);
		String ch;
		for(int i =0; i<5; i++){
			System.out.println("Enter Element");
			ch=sc.next();
			list.addAtEnd(ch);
		}
		list.display();

	}
}
class Node {
	

    private String data;
	private Node next;

	public Node(String data){
         this.data=data;
	}

	public void setData(String data){
		this.data=data;
	}

	public void setNext(Node node){
		this.next=node;
	}
	public String getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
	
}
class LinkedList{
	private Node head;
	private Node tail;
	public Node  getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}
	public void addAtEnd(String data){
		//CREATE A NEW NODE
		Node node = new Node(data); 
	
	if(this.head == null){
		this.head=this.tail=node;
	}
	else{
		this.tail.setNext(node);
		this.tail=node;
	}
	}
public void display(){
		Node temp= this.head;
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
}

