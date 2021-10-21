package Queue;

public class queueUse {

	public static void main(String[] args) {
		queueUsingArray queue = new queueUsingArray();
		for(int i=1; i<=5; i++) {
			try {
				queue.enqueue(i);
			}catch (queueFullException e) {
				
			}
		}
		while(! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			}catch(queueEmptyException e) {
				e.printStackTrace();
			}
		}

	}

}
