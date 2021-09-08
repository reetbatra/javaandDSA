import java.util.Scanner;
public class findANode {

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
	
	public static int findNode(node<Integer> head, int n) {
		node<Integer> node= head;
		int count =0;
		while(node!= null) {
			if(node.data==n) {
				return count;
			}
			else {
				node=node.reference;
				count++;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(findNode(head,n));
		s.close();

	}

}
