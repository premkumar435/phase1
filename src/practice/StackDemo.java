package practice;

import java.util.Stack;

public class StackDemo {
	public static void main(String argvs[])
	 {
	     Stack<Integer> stk = new Stack<Integer>();
	     stk.push(1);
	     stk.push(4);
	     stk.push(3);
	     stk.push(2);
	     stk.push(1);
	     stk.push(4);
	     stk.push(3);
	     stk.push(2);
	     int size = stk.size();
	     System.out.println("size of the stack is: " + size);
	     System.out.println(" stack contains: " + stk);
	 }

}