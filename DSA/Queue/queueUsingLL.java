package Queue;

public class queueUsingLL<T> {
	private node<T> front;
	private node<T> rear;
	int size;
	
	public queueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size == 0;
	}

	T front() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}
		return front.data;
	}
	
	void enqueue(T element) {
		node<T> newNode = new node<>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	T dequeue() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(size == 1) {
			rear = null;
		}
		size--;
		
		return temp;
	}
}
