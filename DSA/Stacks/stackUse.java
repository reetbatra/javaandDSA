package Stacks;

public class stackUse {

	public static void main(String[] args) throws stackFullException {
		stackUsingArray stack = new stackUsingArray(3);
		for(int i=1; i<= 5; i++) {
			stack.push(i);
			}
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			
			} catch(stackEmptyException e) {
				//never reach here
			}
		}

	}

}
