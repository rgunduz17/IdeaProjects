package day62_Collections;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
			list1.addAll(Arrays.asList(100,100,100));
			System.out.println(list1); // [100,100,100]
			System.out.println(list1.get(0));
		
		Set<Integer> st1 = new HashSet<Integer>();
					st1.add(100);
					st1.add(100);
					st1.add(100);
			System.out.println(st1);		
	//	System.out.println(st1.get(0));  ////
			
			System.out.println("=========================");
			
		Set<Integer> hashset = new HashSet<Integer>();
				hashset.add(100);
				hashset.add(10);
				hashset.add(5);
				hashset.add(4);
				hashset.add(3);
				hashset.add(1);
				hashset.add(100);
				// HashSet keeps mixed, does not accept same values
				System.out.println(hashset);
		System.out.println("=========================");
		Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
				linkedhashset.add(100);
				linkedhashset.add(10);
				linkedhashset.add(5);
				linkedhashset.add(4);
				System.out.println(linkedhashset); // LinkedHasSet keeps order as it is
			// doubly linked: ass() & remove() are faster than HashSet

		System.out.println("=========================");
		SortedSet<String> treeset = new TreeSet<String>();
					treeset.add("Z");
					treeset.add("Y");
					treeset.add("X");
					treeset.add("W");
					
					System.out.println( treeset );
					
		//Task: remove duplicates from an ArrayList, and sort it
				List<Integer> list = new ArrayList<Integer>();
						list.addAll(Arrays.asList(10,9,8,7,6,10,10,10,10));
						Collections.sort(list); // how to sort List
						
						
						System.out.println(list);
			
			//solution:			
			List<Integer> list2 = new ArrayList<>();
				list2.addAll(Arrays.asList(10,9,8,7,6,10,10,10,10));
			System.out.println("TREESET");
			TreeSet<Integer> ts = new TreeSet<>(list2);
			System.out.println(ts);
//			System.out.println("HASHSET");
//			Set<Integer> hashset2 = new HashSet<Integer>(list2);
//			System.out.println(hashset2);
	/*
	 		String "AAAABBBCCCDDD";
	 		write program that can remove duplicates from string
	 		
	 */
			String str = "ZZZZYYYXXAAAABBBCCCDDD"; //ZYXABCD
			String[] arr = 	str.split("");
			System.out.println("Arrays.ToString: "+ Arrays.toString(arr) );
			
	TreeSet<String> restroom = new TreeSet<>(Arrays.asList(arr));
	System.out.println("Treeset: "+restroom);

	LinkedHashSet<String> restroom2 = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println("LinkedHashSet: "+ restroom);
	String result = restroom2.toString().replace("[", "").replace("]", "").replace(", ", "");
				
	System.out.println("LinkedHashSet (removed [ ] , : "+result);
						
			// second solution
	String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
	System.out.println(str2);
		System.out.println("==============");





					
					
					
					
					
					
					
					
	}
}
