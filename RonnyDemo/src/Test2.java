import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//1.add
		list.add("hello");	//append a value in the end 
		list.add("AAA");
		list.add("BBB");
		list.add(1, "CCC");//insert a value into list
		list.add("hello");
		
		
		//2.get value by index
//		String str = list.get(0);
//		System.out.println(str);
//		System.out.println(list.get(3));

		System.out.println(list);
		
		//3.remove
		//remove value directly,return a boolean value to tell you if it removed successfully
		boolean f = list.remove("AAAAAA");
		System.out.println(f);
		
		
		//remove value by index, return what value is just removed
//		String value = list.remove(3);
//		System.out.println(value +" is just removed");
		
		System.out.println(list);
		
		
		//4.contains: to see if a list contains a certain value
		boolean f2 = list.contains("hello");
		System.out.println(f2);
		
		//5.indexOf: to find out the first position of a certain value, if it doesn't exist, return -1
		int position = list.indexOf("AAA");
		System.out.println(position);
		
		int lastPosition = list.lastIndexOf("AAA");
		System.out.println(lastPosition);
		
		System.out.println("if AAA is unique?");
		System.out.println(position == lastPosition);
		
		
		//String[] array = new String[5];//5 values
		
	}

}








