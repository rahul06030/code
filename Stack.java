public class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        this.top = -1;
    }
 
    public void push(int x)
    {
        if (isFull())
            System.out.println("Overflow");
         arr[++this.top] = x;
    }
 
    public int pop()
    {
        if (isEmpty())
            System.out.println("Underflow"); 
        return arr[this.top--];
    }

     public int peek()
    {
        if (!isEmpty()) 
            return arr[this.top];
        else 
            System.out.println("Empty"); 
        return -1;
    }
 
    public int size() {
        return this.top + 1;
    }
    public boolean contains(int element){
        if(!isEmpty())
            for( int i=0 ; i<this.top;i++)
                if(arr[i]==element) return true;
        return false;
    }
 


    public Boolean isEmpty()
    {
        return this.top == -1;               
    }
 
    public Boolean isFull() {
        return this.top == this.capacity - 1;     
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);      
        stack.push(2);      
 
        stack.pop();        
        stack.pop();       
 
        stack.push(3);      
        System.out.println("The this.top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
