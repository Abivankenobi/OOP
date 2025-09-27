package collectionsLab;
import java.util.*;
import java.io.*;

public class UniqueWordsSet {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 Set<String> myset= new TreeSet<>();
	 System.out.println("Enter words (type 'exit' to stop):");
	 while (true) {
	 String word = scanner.next();
	 if (word.equalsIgnoreCase("exit")) break;
	 // Add the word to the set
	 myset.add(word);
	 }
	 System.out.println("Unique Words (Sorted): " + myset);
	 // Print set size
	 System.out.println(myset.size());
	 scanner.close();
	 }
	}
