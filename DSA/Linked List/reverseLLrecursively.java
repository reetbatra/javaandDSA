import java.util.Scanner;

public class reverseLLRecursively {

	
	public static node<Integer> takeInput(){
		node<Integer> head= null, tail = null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while(data != -1) {
			node<Integer> newNode = new node<Integer> (data);
			if(head == null) {
				head = newNode;
				tail= newNode;
			}else {
				tail.reference= newNode;
				tail= newNode;
			}
			data =s.nextInt();
		}
		return head;
	}
	public static void print(node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.reference;
		}
		System.out.println();
	}
	
	
	public static node<Integer> reverseLinkedList(node<Integer> head){
		if(head == null || head.reference == null) {
			return head;
		}
		node<Integer> smallHead= reverseLinkedList(head.reference);
		head.reference.reference= head;
		head.reference= null;
		
		return smallHead;
	}
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		node<Integer> newHead = reverseLinkedList(head);
		print(newHead);

	}

}
