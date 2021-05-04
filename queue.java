// import Stack.*;
public class Queue {
  int SIZE,size;
  int arr[] ;
  int front, rear;

  Queue(int SIZE) {
    this.SIZE=SIZE;
    arr = new int[SIZE];
    front = -1;
    size=0;
    rear = -1;
  }

  public int peek(){
    if(!isEmpty()){
     return (arr[this.front]);
    }      System.out.println("Queue is Empty");
    return-1;
  }

  public void enQueue(int element) {

    if (isFull()) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) {
        front = 0;
      }
      SIZE++;
      rear++;
      arr[rear] = element;
    }
  }

  public int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      element = arr[front];

      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        front++;
      }
      SIZE--;
      return (element);
    }
  }

  public int size(){
    return size;
  }

  public void reverse()
    {
        Stack stack = new Stack(this.SIZE);
        while (!this.isEmpty()) {
            stack.push(this.peek());
            this.deQueue();
        }
        while (!stack.isEmpty()) {
            this.enQueue(stack.peek());
            stack.pop();
        }
    
}
  public boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  public  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }


  public boolean contains(int element){
    
    for (int i = front; i <= rear; i++)
        if(arr[i]==element) return true;
    return false;

  }

  public void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
      System.out.print("Queue: ");
      for (i = front; i <= rear; i++)
        System.out.print(arr[i] + "  ");
    }
  }


}
class Main{
  
  public static void main(String[] args) {
    Queue q = new Queue(10);


    q.deQueue();
    for(int i = 1; i < 10; i ++) {
      q.enQueue(i);
    }
    q.enQueue(10);
    q.display();
    q.deQueue();
    q.display();
    q.reverse();
    q.display();
  }
}