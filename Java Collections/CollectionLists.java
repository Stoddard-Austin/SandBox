import java.util.*;


public class CollectionLists {

	public static void main(String[] args) {
		// List
		  List lst = new ArrayList();   // A List contains instances of Object. Upcast ArrayList to List
	      lst.add("Batman");            // add() takes Object. String upcast to Object implicitly
	      lst.add("Robin");
	      lst.add("Bruce");
	      lst.add("Wain");
	      lst.add("Butler");
	      System.out.println("My groups consists of: ");
	      System.out.println(lst);     // [alpha, beta, charlie]
		
		// If you want to add/remove items from only the end of your list, use an ArrayList.
	    // If you want to add/remove items in the middle, use a LinkedList.
	      
	      
		// ArrayList
	    // Manage arrays internally.
	      ArrayList<Integer> age = new ArrayList<Integer>();
	      
	    //Adding
	      age.add(20);
	      age.add(21);
	      age.add(22);
	      age.add(24);
	      age.add(2);
	      
	    // Retrieving
	      System.out.println(age.get(3));
	      
	      System.out.println("\nDisplaying the ArrayList: ");
	    // Loop iteration
	      for(int i = 0; i < age.size(); i++){
	    	  System.out.println(age.get(i));
	      }
		
	    // Removing items
	      age.remove(age.size() - 1);
		
	    // Slow way to remove items
	      age.remove(0);
		
	      System.out.println("\nDisplaying the ArrayList another way: ");
	    // Another way
	      for(Integer value: age) {
	    	  System.out.println(value);
	      }
	      
	      System.out.println();
	      
	      // Linked List
	      // Consist of elements, each element has a reference to the 
	      // previous and next element.
	      LinkedList<Integer> linkedList = new LinkedList<Integer>();
	      System.out.println("Linked List:");
	      
	      // Add items to end of LinkedList
	      for(int i=0; i < 50; i++){
	    	  linkedList.add(i);
	      }
	      
	      // Add items anyway in LinkedList
	      for(int i=0; i < 50; i++){
	    	  linkedList.add(0, i);
	      }
	      
	      for(int i=0; i < linkedList.size(); i++){
	    	  System.out.print(linkedList.get(i) + ", ");
	      }
	      
	      System.out.println("\n");
	      