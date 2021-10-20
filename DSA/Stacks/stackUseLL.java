package Stacks;
import java.util.*;
public class stackUse {

	public static void main(String[] args) throws stackEmptyException {
		
		//creating an object for stack using LL
		
		stackUsingLL stack = new stackUsingLL();
		for(int i = 1; i <= 5; i++) {
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
