package day9;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//1.add value in the end
		list.add("Jo");
		list.add("Jack");	
		list.add("Tom");
		list.add("Jo");
		//add value at a position
		list.add(2, "Alex");	//index: 0~size
		System.out.println(list);
		
		//2.size
//		int size = list.size();
		System.out.println(list.size());
		
		//3.get a value
//		System.out.println(list.get(1));
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
		//for-each
//		for(String v:list) {
//			System.out.println(v);
//		}
		
		//4.remove a value
		//by index, it return the value you just removed
//		String removed = list.remove(3);
//		System.out.println(removed + " is the value just removed");
//		System.out.println("now the list is "+list);
		
		//by value,if the value exist, then only remove the first one
		//it return a boolean value to represent that if you remove value successfully or not
		boolean f = list.remove("Jo");
		System.out.println(f);
		System.out.println(list);
		
		
	}

}
