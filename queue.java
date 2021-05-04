import java.util.*;

class Queue{
	private int size,front, rear; 
	private int[] q;
	private int count=0;

	Queue(int n){
		size=n;
		q=new int[size];
		front=0;
		rear=-1;
	}

	public void enq(int item){
		if( isFull()) System.out.println("Queue Over flow");
		else{
			rear=(rear+1)%size;
			q[rear]= item;
			count++;
		}
			
	}
	public void dq(){
		if(isEmpty()) System.out.println("Queue is Empyty");
		else{
			front= (front+1)%size;
			count--;
		}
			
	}
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else
			return q[front];	
	}
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return (size()==0);
	}
	public boolean isFull(){
		return (size()==size);
	}

public static void main(String[] args) {

        Queue q = new Queue(5);
        q.enq(1);
        q.enq(2);
        q.enq(3);
        
        System.out.println("Front element is: " + q.peek());
        q.dq();
        System.out.println("Front element is: " + q.peek());
 
        System.out.println("Queue size is " + q.size());
 
        q.dq();
        q.dq();
        
        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}