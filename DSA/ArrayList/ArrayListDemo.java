package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		System.out.println(list1.size());
		list1.add(20);
		list1.add(25);
		list1.add(30);
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		//list1.add(index,element);
		list1.add(2,50);
		for(int i=0; i< list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
        for(int elem: list1) {
        	System.out.print(elem + " ");
        }
	}

}
