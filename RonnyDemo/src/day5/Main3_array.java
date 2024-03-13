package day5;

public class Main3_array {

	public static void main(String[] args) {
		int a = 10;
		// type[] name = new type[length];
		int[] arr = new int[5];
		//operate array element by name[index]
		arr[0]=11;
		arr[1]=66;
		arr[2]=23;
		arr[3]=90;
		arr[4]=7;

		//A->B->D->C->B->D->C->B->D->C->B(it's false)the end
		for(int i=0 ; i<5 ; i++){
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
	}

}










