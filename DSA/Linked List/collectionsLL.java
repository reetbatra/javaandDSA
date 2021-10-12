import java.util.LinkedList;
public class collectionLL {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();//doubly linked list
		list.add(10);
		list.add(30);
		list.addLast(40);
		list.addFirst(1);
		list.set(3, 50);
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+ " ");
			
			
		}
		 
	}

}
