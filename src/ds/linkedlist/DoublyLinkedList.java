package ds.linkedlist;

import java.util.LinkedList;

public class DoublyLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> vilass=new LinkedList();
		
		vilass.add("Vinoth A");
		vilass.add("Aravind");
		vilass.add("Vinoth S");
		vilass.add("Praveen");
		vilass.add("Aravind");
		vilass.add("Daas");
		vilass.get(2);
		System.out.println(vilass.removeLastOccurrence("Aravind"));
		System.out.println(vilass.toString());
		
		System.out.println(vilass.listIterator(3));
	}
}
