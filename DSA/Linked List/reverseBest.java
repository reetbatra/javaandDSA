import java.util.Scanner;

public class reverseBest {
	public static node<Integer> ReverseBest(node<Integer> head){
		if(head == null || head.reference == null) {
			return head;
		}
		node<Integer> reversedTail= head.reference;//final list ki tail will be the original list ka 2nd element 
		//because recursion, small problem
		node<Integer> smallHead= ReverseBest(head.reference);
		reversedTail.reference = head;
		head.reference= null;
		
		return smallHead;
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
        head= ReverseBest(head);
        print(head);

	}

}


