package day65_MapInterface;

import java.util.*;

public class MapProgram {

    public static void main(String[] args) {
        //    key , value
        Map<String, Double> employees = new HashMap<>();

        // 1. put(): ads keys and value
		employees.put("Nurullah", 200000.99);
		employees.put("Alla", 120000.89);
		employees.put("Erhan", 500000.9876);
        System.out.println( employees );

        // 2. get(): get the value
        double salary1 = employees.get("Nurullah");
		System.out.println(salary1);
        System.out.println(employees.get("Alla"));

        // 3. remove(): remove the keys and value
        employees.remove("Nurullah");
		System.out.println( employees );

		// 4. containsKey(): check the key, return boolean
        boolean a =employees.containsKey("Mahribana");
		System.out.println( a );//the key "Mahribana" does not exist in the map

        // 5. containsValue(): check the value, return boolean
        boolean b = employees.containsValue(100000.99);
		System.out.println( b ); // value does not exist
        // 6. keySet(): return keys only
        Set<String> set = employees.keySet();
		System.out.println(set);




        System.out.println(" ========================================= ");
        	Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
			map1.put("A", 100);
			map1.put("A", 10);
			map1.put("A", 9);
			map1.put("A", 8);

			System.out.println(map1);

			map1.put("B", 85);
			map1.put(null, null);
			System.out.println(map1);

        System.out.println(" ========================================= ");
        Hashtable<String, Integer> map2 = new Hashtable<String, Integer>();
		map2.put("A", 123);
		System.out.println(map2);
        System.out.println(" ========================================= ");

		TreeMap<String, Integer> map3 = new TreeMap<String, Integer>();
		map3.put("Z", 1000);
		map3.put("Y", 9000);
		map3.put("X", 1000000);
        map3.put("A", 123);
		System.out.println(map3);
    }
}
