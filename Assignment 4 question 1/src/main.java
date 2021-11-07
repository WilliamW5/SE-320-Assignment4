import java.util.Arrays;
import java.util.LinkedHashSet;

public class main {
	
	/*
	 * Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin",
	 * "Michelle", "Ryan"} and find their union, difference, and intersection. (You can clone the sets to preserve the original sets
	 * from being changed by these set methods.)
	 */

	public static void main(String[] args) {
		// Creates both initial sets
		LinkedHashSet<String> set1 = new LinkedHashSet(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		LinkedHashSet<String> set2 = new LinkedHashSet(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		// Finding the Union
		LinkedHashSet<String> union = new LinkedHashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("The Union of the two sets is: \n" + union + "\n");
		
		// Finding the Difference
		LinkedHashSet<String> diff = new LinkedHashSet<>();
		diff.addAll(set1);
		diff.removeAll(set2);
		System.out.println("The Difference of the two sets is: \n" + diff + "\n");
		
		// Finding the Intersection
		LinkedHashSet<String> intersect = new LinkedHashSet<>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		System.out.println("The Intersection of the two sets is: \n" + intersect);
		
	}
	
}
