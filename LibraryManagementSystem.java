package collectionsLab;
import java.util.*;
public class LibraryManagementSystem {
	 public static void main(String[] args) {
	 // 1 Using List (ArrayList) to store books (A,B,C,D,E)
	ArrayList<String> books=new ArrayList<>();
	books.add("A");
	books.add("B");
	books.add("C");
	books.add("D");
	books.add("E");
		 
	 System.out.println("Books Available: " + books);
	 // Remove book C
	 books.remove("C");
	 System.out.println("Books After Removal: " + books);
	 // 2 Using Set (HashSet) to store unique users(Alice,Bob,Charlie)
	 HashSet<String> users = new HashSet<String>();
	 users.add("Alice"); // Attempt to add duplicate user
	 users.add("Bob");
	 users.add("Charlie");
	 System.out.println("Registered Users: " + users); // HashSet prevents duplicates

	 // 3 Using Map (HashMap) to track borrowed books {(A,Alice),(B,Bob),(D,Charlie)}
	 HashMap<String, String> borrowedBooks = new HashMap<String, String>();
	 borrowedBooks.put("A", "Alice");
	 borrowedBooks.put("B", "Bob");
	 borrowedBooks.put("D", "Charlie");
	 System.out.println("Borrowed Books: " + borrowedBooks);
	 System.out.println("Who borrowed 'Book A'? " + borrowedBooks.get("A"));
	 // Remove an entry when book is returned
	 borrowedBooks.remove("A");
	 System.out.println("Updated Borrowed Books: " + borrowedBooks);
	 }
	}
