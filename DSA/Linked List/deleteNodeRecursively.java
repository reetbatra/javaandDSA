package LinkedListMain;

import java.util.Scanner;

public class deleteNodeRecursively {
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

		public static node<Integer> deleteNodeRec(node<Integer> head, int pos){
			if(head==null) {
				return head;
			}
			if(pos == 0) {
				return head.reference;
				
			}
			node<Integer> smallHead= deleteNodeRec(head.reference, pos-1);
			head.reference = smallHead;
			return head;
			
		}
		
		public static void main(String[] args) {
			node<Integer> head= takeInput();
			Scanner s = new Scanner(System.in);
			int pos= s.nextInt();
			node<Integer> newHead= deleteNodeRec(head,pos);
			print(newHead);
			

		}

	}
