import java.util.Scanner;

public class midpointOfll {
	
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
	
	public static node<Integer> findMidPoint(node<Integer> head){
		node<Integer> slow=head, fast=head;
		while(fast.reference != null && fast.reference.reference != null) {
			slow= slow.reference;
			fast= fast.reference.reference;
		}
		return slow;
		
	}

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		node<Integer> midpoint = findMidPoint(head);
		System.out.println(midpoint.data);

	}

}
