package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		HashMap<Object, String> list= new HashMap<Object, String>();

	   list.put("USA", "NY");
	   list.put("CANADA","TORONTO");
	   list.put("BANGLADESG", "DHAKA");
	   list.put("Japan", "Tokyo");


	   	for(Map.Entry<Object, String> entry:list.entrySet()){

			System.out.println(entry.getKey()+":"+entry.getValue());




		}


	}

}
