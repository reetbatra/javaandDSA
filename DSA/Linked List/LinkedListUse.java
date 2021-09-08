import java.util.Scanner;
public class LinkedListUse {
    
	public static node<Integer> takeInput()
	{
		node<Integer> head = null, tail= null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			node<Integer> newNode = new node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail= newNode;
			}
			else {
//				node<Integer> temp = head;
//				while(temp.reference != null) {
//					temp = temp.reference;
//				}
//				temp.reference = newNode;
				tail.reference = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	
	public static void print(node<Integer> head) {
		System.out.println();
		while(head != null) {
			System.out.print(head.data + " ");
			head= head.reference;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//node<Integer> node1 = new node<Integer>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.reference);
//		node<Integer> node2 = new node<Integer>(20);
//		node1.reference= node2;
//		System.out.println(node2);
//		System.out.println(node1.reference);
//		node<Integer> node1= new node<Integer>(10);
//		node<Integer> node2 = new node<Integer>(20);
//		node<Integer> node3 = new node<Integer>(30);
//		node1.reference = node2;
//		node2.reference = node3;
//        node<Integer> head = node1;
        //print(head);
		node<Integer> head = takeInput();
        print(head);
	}

}
