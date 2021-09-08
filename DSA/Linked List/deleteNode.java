import java.util.Scanner;

public class deleteNode {
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
	

	public static node<Integer> deletenode(node<Integer> head, int pos) {
		
        if(head == null)
        {
            return head;
        }
        if (pos<0)
        {
            return head;
        }
            
        else if(pos==0)
        {
            head=head.reference;
        }
        else
        {
            node<Integer> n=head,delNode=null;
            for (int i=0;i<pos-1 && n!=null;i++)
            {
                n=n.reference;
            }
            if (n!=null && n.reference!=null)
            {
                if (n.reference!=null)
                {
                    n.reference=n.reference.reference;
                }
                else
                {
                    n.reference=null;
                }
                
            }
        }
        return head;
	}

	public static void main(String[] args) {
		
			node<Integer> head= takeInput();
			Scanner s = new Scanner(System.in);
			int pos= s.nextInt();
			head=deletenode(head, pos);
			print(head);
			
			s.close();
		

	}

}
