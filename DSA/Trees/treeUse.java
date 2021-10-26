
public class treeUse {

	public static void main(String[] args) {
		treeNode<Integer> root  = new treeNode<Integer>(4);
		treeNode<Integer> node1  = new treeNode<Integer>(2);
		treeNode<Integer> node2  = new treeNode<Integer>(3);
		treeNode<Integer> node3  = new treeNode<Integer>(5);
		treeNode<Integer> node4  = new treeNode<Integer>(6);
		root.children.add(node1);
		
		root.children.add(node2);
		root.children.add(node3);
		
		node2.children.add(node4);
		
		System.out.println(root);
		
		
	}

}
