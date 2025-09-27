package collectionsLab;
import java.util.*;
public class StudentMarksMap {
	 public static void main(String[] args) {
	 // Step 1: Create a HashMap to store student names and marks
	 Map<String, Integer> studentMarks = new HashMap<>();
	 // Step 2: Add 3 more students and their marks
	 studentMarks.put("Alice", 85);
	 studentMarks.put("Bob", 78);
	 studentMarks.put("C", 68);
	 studentMarks.put("D", 100);
	 studentMarks.put("E", 69);
	 // Step 3: Print all students and their marks
	 System.out.println(studentMarks);
	 // Step 4: Find and print Alice's marks
	 System.out.println(studentMarks.get("Alice"));
	 // Step 5: Remove Bob from the map
	 studentMarks.remove("Bob");
	 // Step 6: Check if David exists in the map
	 Boolean ans=studentMarks.containsKey("David");
	 System.out.println(ans);
	 // Step 7: Display the total number of students
	 System.out.println(studentMarks.size());
	 }
	}
