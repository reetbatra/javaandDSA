import java.util.Scanner;

public class Insertnode {
	
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
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.reference = newNode;
				tail = newNode; // tail = tail.referecne
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.reference;
		}
		System.out.println();

	}

	public static node<Integer> insert(node<Integer> head, int data, int pos){
		node<Integer> newNode = new node<Integer>(data);
		if(pos == 0){
			newNode.reference = head;
			return newNode;
		}
		int i = 0;
		node<Integer> temp = head;
		while(i < pos - 1){
			temp = temp.reference;
			i++;
		}
		newNode.reference = temp.reference;
		temp.reference = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		
		node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
		

	}

}

