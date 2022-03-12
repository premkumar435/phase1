package practice;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
	public static void main(String[] args) {
	      Queue<Integer> q = new LinkedList<>();
	      q.add(1);
	      q.add(3);
	      q.add(3);
	      q.add(9);
	      q.add(9);
	      System.out.println("The queue is: " + q);
	      
	      int num1 = q.remove();
	      System.out.println("one element deleted from the head is: " + num1);
	      System.out.println("queue after deletion is: " + q);
	
	      int head = q.peek();
	      System.out.println("head of the queue is: " + head);
	      
	      int size = q.size();
	      System.out.println("size of the queue is: " + size);
	}

}