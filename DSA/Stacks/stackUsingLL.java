package Stacks;
/*
 * time complexity: O(1) for all operations
 * space complexity: O(N)
 * 
 * where N is the number of operations
 */

public class stackUsingLL {
      private node head;
      private int size;
      
      public stackUsingLL() {
    	  head = null;
    	  size = 0;
      }
      
     public int getsize() {
    	  return this.size;
      }
      
      public int top() {
    	  if(this.head == null) {
    		  return -1;
    	  }
    	  return this.head.data;
      }
      
      public boolean isEmpty() {
    	  return this.size == 0;
    	  }
      
      void push(int element) {
    	  node newnode = new node(element);
    	  
    	  if(this.head == null) {
    		  this.head= newnode;
    	  }else {
    		  newnode.next = this.head;
    		  this.head = newnode;
    	  }
    	  this.size++;
      }
      
      public int pop() throws stackEmptyException{
    	  if(this.head == null) {
    		  return -1;
    		  
    	  }
    	  int ans = head.data;
    	  head = head.next;
    	  size--;
    	  return ans;
  
      }
}
