package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>();
					
			for( int i = 0; i<= 10; i++ ) {
				if( i%2 != 0 ) {
					continue;
				}
					list.add(i);
			}

		System.out.println( list ); //[0, 2, 4, 6, 8, 10]
		System.out.println( list.size());  // 6
		
		
		for( int i = 0; i < list.size(); i++ ) {
			System.out.print( list.get(i)+" ");
								// 0 2 4 6 8 10
		}


		System.out.println();
		
		
		for( int each : list ) { // unboxing
			System.out.print(each+" ");
		}
		System.out.println();
		
		
		
		int num = list.get(5); // unboxing, there are no primitives in ArrayList

		System.out.println( num );
		
	    // list.clear(); // size of list becomes 0: []
		
		System.out.println( list.get(2) );
		
		// sorting the ArrayList:
			Collections.sort(list);
			
			System.out.println(list);
			
			ArrayList<Integer> list2 = new ArrayList<>();
			
			for(int i =10; i>0; i--) {
				list2.add(i);
			}

		System.out.println( list2 );
//		[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

//		 sorting the ArrayList:
			Collections.sort( list2 );


		System.out.println( list2 );
//		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		list2.remove(3);
		System.out.println(list2);
//		[1, 2, 3, 5, 6, 7, 8, 9, 10]
		Integer result = list2.remove(5);
		System.out.println(result);


		System.out.println(list2.lastIndexOf(9));
//		last occurrence of 9 is: index 8



		System.out.println(list2.indexOf(5));
//		index of 5 is:   4;




		list2.set(2,100);
		System.out.println(list2);
//		[1, 2, 100, 4, 5, 6, 7, 8, 9, 10]
			


			
// END================================================		
	}
	
	
}
