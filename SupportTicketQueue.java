package collectionsLab;

import java.util.*;

public class SupportTicketQueue {
	 public static void main(String[] args) {
	 // Step 1: Create a Queue to store support tickets
	 Queue<String> supportQueue = new LinkedList<>();
	 // Step 2: Add 3 more support tickets to the queue
	 supportQueue.offer("Issue with login");
	 supportQueue.offer("Payment not processed");
	 supportQueue.offer("1");
	 supportQueue.offer("2");
	 supportQueue.offer("3");
	 System.out.println(supportQueue);
	 // Step 3: Process each ticket one by one
	 while(!supportQueue.isEmpty()) {
	 supportQueue.poll();
	 System.out.println(supportQueue);}
	 // Step 4: Check if the queue is empty

	 if(supportQueue.isEmpty()) System.out.println("Empty");
	 }
	}
