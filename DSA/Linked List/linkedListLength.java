import java.util.Scanner;

public class LinkedListLength {
	public static node<Integer> takeInput()
	{
		node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			node<Integer> newNode = new node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				tail.reference = newNode;
				tail = newNode; // tail = tail.referecne
			}
			data = s.nextInt();
		}
		return head;
	}

	public static int length(node<Integer> head) {
		int count=0;
		while(head != null) {
			count ++;
			head = head.reference;
		}
		return count;
	}
	public static void main(String[] args) {
		node<Integer> head = takeInput();
		System.out.println(length(head));
	}

}
