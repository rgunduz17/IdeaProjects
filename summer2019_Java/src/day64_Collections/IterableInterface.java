package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IterableInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
				list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7));
				
				for(int i = 0; i < list.size(); i++) {
					
					if(list.get(i) == 1) {
						list.remove(i);
					}
					
				}
				
				System.out.println( list );
				
				List<Integer> list2 = new ArrayList<Integer>();
				list2.addAll(Arrays.asList(1));
				
				Iterator<Integer> it = list2.iterator();
				boolean a = it.hasNext();
				System.out.println(a); 	 // true
				
				System.out.println(it.next());
				
				boolean b = it.hasNext();
				System.out.println(b);
			//	System.out.println(it.next()); 	//there are not enough data elements
				
			System.out.println("=================================================");
				
			List<Integer> list3 = new ArrayList<Integer>();
			list3.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7));
			// remove all data elements that are equal to one
			
			Iterator<Integer> it3 = list3.iterator();
			
			while(it3.hasNext()) {
				int num = it3.next();
				if(num == 1) {
					
					it3.remove();
					
				}
			
			}
				
			System.out.println(list3);	
				
			
				System.out.println("=================================================");
				
				Set<Integer> set = new LinkedHashSet<Integer>();
				set.addAll( Arrays.asList(10, 20) );
				
				Iterator<Integer> iterate = set.iterator();
				System.out.println( iterate.hasNext() ); //true
				System.out.println( iterate.next() );

				System.out.println( iterate.hasNext() ); //true
				System.out.println( iterate.next() );
				
				
				System.out.println("=================================================");
				String[] name = {"Erhan", "Eholly", "Yusuf", "Ibrohim", "Tarbiz"};
				
				Set<String> names = new LinkedHashSet<String>();
				names.addAll(Arrays.asList(name));
				
				Iterator<String> removeE = names.iterator();
				
				while(removeE.hasNext()) {
						String str = removeE.next();
						if( str.toLowerCase().contains("e") ) {
							removeE.remove();
						}
						
				}
				
				System.out.println(names);
				
				System.out.println("=================================================");
				//  for(initialization; condition; iterator)
				// 			mandatory	mandatory
				
				List<Integer> myList = new ArrayList<Integer>();
				myList.addAll(Arrays.asList(100,900,500,99,200,89,300,79));
				
				for(Iterator<Integer> itr = myList.iterator(); itr.hasNext();) {
					int numbers = itr.next();
					if(numbers > 100) {
						itr.remove();
					}
				}
				
				System.out.println(myList);
				
		String[] students = {"Erhan", "Erhan","Erhan","Aijamal","Safwan","Madina","Erhan","Erhan"};
		
		List<String> namelist = new ArrayList<String>();
			namelist.addAll(Arrays.asList(students));
			
			for( Iterator<String> itr = namelist.iterator(); itr.hasNext(); ) {
					String str = itr.next();
					if(str.equalsIgnoreCase("Safwan") || str.equalsIgnoreCase("Erhan")) {
						itr.remove();
					}
			}
			
			
			System.out.println(namelist);
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
