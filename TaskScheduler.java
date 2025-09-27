package collectionsLab;
import java.util.*;
public class TaskScheduler {
	 public static void main(String[] args) {
	 // Step 1: Define an array of tasks {A,B,C,D,E}
	String[] tasks = {"A","B","C","D","E"};
	 // Step 2: Initialize a Queue (LinkedList) to store tasks
	Queue<String> taskmanager = new LinkedList<String>();
	 // Step 3: Add tasks from array to queue
	for(String i:tasks) taskmanager.offer(i);
	 // Step 4: Process tasks in FIFO order
	 System.out.println("Processing Tasks...");
	while(!taskmanager.isEmpty()) {
		
	String task= taskmanager.poll();
	System.out.println("Executing: "+task);
	}
	
	 System.out.println("All tasks completed!");
	 }
	}
