import java.util.Scanner;
public class reverseIteratively{

public static node<Integer> reverse(node<Integer> head){
	node<Integer> curr = head;
	node<Integer> prev= null;
	node<Integer> temp;
	
	while(curr != null) {
		temp = curr.reference;
		curr.reference = prev;
		prev= curr;
		curr = temp;
	}
	return prev;
	
}
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
         public static void main(String[] args) {
        	 node<Integer> head= takeInput();
        	 head = reverse(head);
        	 print(head);
         }

}
