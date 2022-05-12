package qaautomation.march2022.javatask;

import java.util.TreeMap;
import java.util.TreeSet;

public class Task1_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tree Set => non-duplicate, sorted, value only
		TreeSet<Integer> zipCode = new TreeSet<>();
		//add
		zipCode.add(12345);
		zipCode.add(55126);
		zipCode.add(32456);
		zipCode.add(12345);
		zipCode.add(44213);
		zipCode.add(21345);
		
		//call
		System.out.println(zipCode);
		for (Integer item : zipCode){
			System.out.println(item);
		}
		
		//Tree Map => non-duplicate, sorted, pairs key/value
		TreeMap<Integer, String> zipCodeFor = new TreeMap<>();
		//add
		zipCodeFor.put(12345, "Bandung");
		zipCodeFor.put(55126, "Surabaya");
		zipCodeFor.put(32456, "Yogyakarta");
		zipCodeFor.put(12345, "Malang");
		zipCodeFor.put(44213, "Jakarta");
		zipCodeFor.put(21345, "Jakarta");
		
		//call
		System.out.println(zipCodeFor);
		for (Integer key : zipCodeFor.keySet()) {
			System.out.println("Zip code for "+ zipCodeFor.get(key) +" is "+key);
		}
		
	}

}
