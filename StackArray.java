        //properties
  public class StackArray{       
  	private int[] stackArray;
  	private int top;
  	private int maxSize;

		//constructor to initialize the stack
	public StackArray(int size){     
		maxSize = size;
		stackArray = new int [maxSize];
		top = -1;  // top is initialized to -1, meaning the stack is empty
	}
	
	//push method to add elements to the stack
	public void push (int value) {	
	 if (isFull()){
	        System.out.println("Stack is full. Cannot push: " + value);
	 }else{
	 	stackArray[++top] = value;
	 }
	}
	
	 	
	 	//pop method to remove and return the top element of the stack
	 	
	 	public int pop () {
	 		if(isEmpty()){
	 			 System.out.println("Stack is empty. Cannot pop.");
	 			 return -1;
	 		}else{
	 			return stackArray[top--];
	 		}
	 	}
	 	
	 	//peek method to view the top element without removing it
	 	
	 	public int peek(){
	 			if(isEmpty()){
	 				System.out.println("Stack is empty. ");
	 				return -1;
	 			}else{
	 				return stackArray [top];
	 			}
	 	}
	 	
	 	//method to check if the stack is Empty
	 	
	 	public boolean isEmpty(){  //check if the top is not negative
	 			return(top == -1);
	 	}
	 	
	 	//method to check if the stack is Full
	 	public boolean isFull(){
	 			return (top == maxSize -1);
	 	}
	 	
	 	public static void main (String [] args){
	 			StackArray stack = new StackArray (5);  //create a stack with a size of 5
	 			
	 		
	 		        stack.push(10);
	 		        stack.push(20);
	          stack.push(30);
	          stack.push(40);
	 		        stack.push(50);
	          stack.push(60); //This will display "Stack is full"
	         
	        
	         System.out.println("Top element is: " + stack.peek());   //should display 50
	         System.out.println("Popped element : " + stack.pop());    //should display 50
	         System.out.println("Top element after pop : " + stack.peek()); //should display 40
	 
	}
	
}