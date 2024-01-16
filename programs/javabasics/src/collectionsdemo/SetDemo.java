package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class SetDemo {

	public static void main(String[] args) {
		//Set<String> countrylist = new HashSet<String>();
		SortedSet<String> countrylist =  new TreeSet<String>();
		countrylist.add("India");
		countrylist.add("Japan");
		countrylist.add("Korea");
		countrylist.add("USA");
		countrylist.add("India");
		
		Iterator itr = countrylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
