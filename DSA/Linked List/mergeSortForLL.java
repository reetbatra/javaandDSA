import java.util.Scanner;

public class mergeSortForLL {

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

	public static node<Integer> merge(node<Integer> head1, node<Integer> head2){
		if(head1 == null) {//list 1 doesnt exist
			return head2;//return list 2 without merging
		}
		if(head2 == null) {//list 2 doesnt exist
			return head1;//return list 1 without merging
		}
		
		node<Integer> t1= head1, t2= head2, head3=null, tail3=null;
		
		if(t1.data <= t2.data) {
			head3 = t1; //final list-merged
			tail3 = t1;
			t1 = t1.reference;
		}
		else {
			head3= t2;
			tail3= t2;
			t2=t2.reference;
		}
		while( t1 !=null && t2 != null) { //conditon of while is till when both the lists exists
			if(t1.data <= t2.data) {
				tail3.reference = t1;
				tail3= t1;
				t1= t1.reference;
			}else {
				tail3.reference= t2;
				tail3=t2;//or tail3=tail3.reference
				t2=t2.reference;
				
			}
		}
		if(t1 != null) {//if one list gets over attach another directly
			tail3.reference = t1;
		}else {
			tail3.reference = t2;
		}
		return head3;
	}
	
	public static node<Integer> mergeSort(node<Integer> head){
		if(head==null || head.reference==null) {
			return head;
		}
		node<Integer> mid = findMidPoint(head);
		node<Integer> half1= head;
		node<Integer> half2 = mid.reference;
		mid.reference= null;
		
		half1= mergeSort(half1);
		half2= mergeSort(half2);
		
		node<Integer> finalHead= merge(half1, half2);
		
		return finalHead;
	}
	
	public static void main(String[] args) {
		node<Integer> head = takeInput();

         node<Integer> finalHead = mergeSort(head);
         print(finalHead);

	}

}
