package Stacks;

public class stackUsingArray {
        private int data[];
        private int top; // is the index of topmost element of stack
        
        public stackUsingArray(int capacity) {
        	data = new int[capacity];
        	top = -1;
        }
        
        public boolean isEmpty() {
//        	if(top == -1) {
//        		return true;
//        	}
//        	else {
//        		return false;
//        	}
        	return(top == -1);
        }
        
        public int size() {
        	return top +1;
        }
        
        public int top() throws stackEmptyException {
        	if(size() == 0) {
        		//stackEmptyException
        		stackEmptyException e = new stackEmptyException();
        		throw e;
        	}
        	return data[top];
        }
        
        public void push(int elem) throws stackFullException {
        	if(size() == data.length) {
        		//stackFullException
        		stackFullException e = new stackFullException();
        		throw e;
        				
        	}
        	top++;
        	data[top] = elem;
        }
        //if you want a dynamic stack instead of throwing this exception 
        // you can double the size
        
        
        public int pop() throws stackEmptyException{
        	if(size() == 0) {
        		//stackEmptyException
        		stackEmptyException e = new stackEmptyException();
        		throw e;
        	}
        	int temp = data[top];
        	top--;
        	return temp;
        }
        
}
