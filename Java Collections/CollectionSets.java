import java.util.HashSet;
import java.util.*;
import java.util.Set;


public class CollectionSets {

	public static void main(String[] args) {
		// Sets are great for finding a particular item quickly (unlike lists) 
		
		// HashSet does not retain order
		// Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers the order you put the items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts items in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		set1.add("Austin");
		set1.add("Stoddard");
		set1.add("Momo");
		set1.add("Alan");
		set1.add("Kobe");
		
		System.out.println(set1);

		for(String element: set1){
			System.out.println(element);
		}
		
		////////////// Does set contain a certain item? \\\\\\\\\\\\\\\
		if(set1.contains("Manwaring")) {
			System.out.println("Alias: MC");
		} else {
			set1.add("Manwaring");
		}
		
		System.out.println(set1);
		
		//////////////////// Intersection \\\\\\\\\\\\\\\\\\\\\\\\\\
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("Austin");
		set2.add("Stoddard");
		set2.add("Eleazar");
		set2.add("Emilia");
		set2.add("Lyla");
		
		// Makes intersection a copy of set1
		Set<String> intersection = new HashSet<String>(set1);
		
		// Keeps only the elements in both sets
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		// Difference
		Set<String> difference = new HashSet<String>(set1);
		
		// Keeps only the elements that aren't alike
		difference.removeAll(set2);
		
		System.out.println(difference);
	}

}
