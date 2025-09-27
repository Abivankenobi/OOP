package collectionsLab;
import java.util.*;
public class EmployeeSalaryMap {
	 public static void main(String[] args) {
	 // Step 1: Create a TreeMap to store employee names and salaries
	TreeMap<String,Integer> employeeSalaries=new TreeMap<String, Integer>();
	 //map entries
	 employeeSalaries.put("John", 50000);
	 employeeSalaries.put("Alice", 60000);
	 employeeSalaries.put("Bob", 55000);
	 employeeSalaries.put("David", 65000);
	 employeeSalaries.put("Eve", 70000);
	 // Step 2: Print all employees in sorted order
	 System.out.println(employeeSalaries);
	 // Step 3: Increase John's salary by 5000
	 int salary=employeeSalaries.get("John");
	 employeeSalaries.replace("John", salary+5000);
	 // Step 4: Find the employee with the highest and lowest salary
	 System.out.println("H: "+employeeSalaries.lastKey());
	 System.out.println("L: "+ employeeSalaries.firstKey());
	 // Step 5: Check if "Michael" exists in the map;
	 System.out.println(employeeSalaries.containsKey("Michael"));
	 // Step 6: Remove an employee (e.g., "Bob")
	 employeeSalaries.remove("Bob");
	 System.out.println(employeeSalaries);
	 }
	}
