package classesandobj;

public class dynamicarrayclass {
           private int data[]; //this is not an array until now just a data storage reference we will make this an array in our constructor  
           private int nextIndex;
           
           public dynamicarrayclass() { //constructor
        	   data = new int[5];
        	   nextIndex = 0;
           }
           
           public int size() {
        	   return nextIndex;
           } 
        	   
           public void add(int element) {
        	   if(nextIndex == data.length) {
        		   restructure();// when array is full call this function
        	   }
        	   data[nextIndex] = element;
        	   nextIndex++; 
        	    
           }
        	   
           public void set(int index, int element) {
        	    if(index>nextIndex) {
        	    	return;
        	    }
        	    if(index < nextIndex) {
        	    	data[index] = element;
        	    } else {
        	    	add(element);
        	    }
           }
        	   
           public int get(int index) {
        	   //error out
        	   return -1;
           }
        
           public boolean isEmpty() {
        	    if(size() == 0) {
        	    	return true;
        	    } else {
        	    	return false;
        	    }
           }
        	    
        	   
           public int removelast() {//return last index and move nextindex at last index
        	   //also check if size is 0 then nothing can be returned
        	    if(size()==0) {
        	    	//error out
        	    	return -1;
        	    }
        	    int value = data[nextIndex -1];
        	    data[nextIndex -1] = 0;
        	    nextIndex --;
        	    return value;
           }
        	   
           private void restructure() {
        	   int temp[] = data;
        	   data = new int[data.length *2];
        	   for(int i=0; i< temp.length; i++) {
        		   data[i] = temp[i];
        	   }
           }
        	   
           }
           