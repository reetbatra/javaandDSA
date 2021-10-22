package Queue;

public class dynamicQueue {
	      
		private int data[];
		private int front;//index at which front element is stored, deletion will be from front
		private int rear;// index at which rear element is stored. addition will be from rear
		private int size;
		
		public dynamicQueue() {//constructor if size is not given
			data = new int[10];
			front = -1;
			rear = -1;
			size = 0;
		}
		
		public dynamicQueue(int capacity) {//constructor if size is given
			data = new int[capacity];
			front = -1;
			rear = -1;
			size = 0;
		}
		
		int size() {
			return size;
		}
		
		boolean isEmpty() {
			return size == 0;
		}
		
		int front() throws queueEmptyException{
			if(size == 0) {
				throw new queueEmptyException(); 
			}
		return data[front];
		}
		
		void enqueue(int element) throws queueFullException {
			
			if(size == data.length) {
				 //throw new queueFullException();
				doubleCapacity();
			}
			
			if(size == 0) {
				front = 0;
			}
			size++;
			rear = (rear +1) % data.length;
//			rear++;
//			if(rear == data.length) {
//				rear = 0;
//			}
			data[rear] = element;
		}
		
		private void doubleCapacity() {
		     int temp[] = data;
		     data = new int[2* temp.length];
		     int index =0;
		     for(int i= front; i< temp.length; i++) {
		    	 data[index] = temp[i];
		    	 index++;
		     }
		     for(int i=0; i<= front -1; i++) {
		    	 data[index] = temp[i];
		    	 index++; 
		}
		     front =0;
		     rear = temp.length -1;
		}
		
		int dequeue() throws queueEmptyException {
			if(size == 0) {
				throw new queueEmptyException();
			}
			int temp = data[front];
			front = (front +1) % data.length;
			//front++;
//			if(size == 0) {
//				front = -1;
//				rear = -1;
//			}
			size--;
			return temp;
		}
	

}
