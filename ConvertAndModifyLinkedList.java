package collectionsLab;
import java.util.*;
import java.util.Random;

public class ConvertAndModifyLinkedList {
	public static void main(String[] args) {
	ArrayList<Integer> rand=new ArrayList<Integer>();
	
	for(int i=0;i<10;i++)rand.add((int)(100*Math.random()));
	System.out.println(rand);
	
	LinkedList<Integer> linky=new LinkedList<Integer>(rand);
	
	linky.addFirst((int)(100*Math.random()));
	System.out.println(linky);
	
	linky.addLast((int)(100*Math.random()));
	System.out.println(linky);
	
	linky.remove(1);
	
	linky=linky.reversed();
	System.out.println("Original ArrayList: " + rand);
	System.out.println("Modified LinkedList: " + linky);
}
}