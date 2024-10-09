class stackNode{ //class node
    int data;
    stackNode next;
    
    public stackNode(int data){ //this is constructor
        this.data = data;
        this.next = null;
        
    }
}
class Stack{
    private stackNode top; // private is access modifier
    
    public Stack(){// this is constructor
        this.top = null;
        
    }
    public void push(int data){   //if public void there's no data that will return 
        stackNode newNode = new stackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + "pushed onto stack. "); // the plus sign is concatenation
        
    }
    
    public int pop(){   // the public int is return type
        if(isEmpty()){
            System.out.println("Stack is empty ");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
        
            
    } 
    
    public int peek(){
        if(isEmpty()){
             System.out.println("Stack is empty");
            return -1;
            
            
        }
        return top.data;
        
    }
    
    public boolean isEmpty(){
        return top == null;
        
    }
    
    
}

   public class StackLinkedList{
       public static void main(String [] args){
         Stack stack = new Stack();
           
           stack.push(10);
           stack.push(20);
           stack.push(30);
           
           System.out.println("Top element is : " + stack.peek());
           
           
           
       }
       
       
   }         
            
            
            
            