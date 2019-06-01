package optional;

import java.util.ArrayList;
import java.util.Random;

public class BetterArrayList extends ArrayList<Object>  {

	public static void main(String[] args) {
		
		ArrayList<Object>list = new ArrayList<Object>();
		Object lastElement = new Object();
		
		
		addToList(list);
		
		print(list);
		
		pop(list, lastElement);
		print(list);
		pop(list, lastElement);
		print(list);
		
		addIndexAndNumber(list, 3, 78);
		print(list);
		
	}

	public static void addIndexAndNumber(ArrayList<Object> list,int index, int element) {
		list.add(index, element);
	}

	private static void addToList(ArrayList<Object> list) {
		for (int i = 0; i <= 10; i++) {
			list.add(i);
			System.out.println(list);	
		}
		
	}

	public static void pop(ArrayList<Object> list, Object lastElement) {
		for (int i = 0; i < list.size(); i++) {
			 lastElement = list.get(list.size()-1);		
		}
		System.out.println(lastElement);
		list.remove(lastElement);
	}

	private static void print(ArrayList<Object> list) {
		System.out.println(list.toString());
	}

	 
}
