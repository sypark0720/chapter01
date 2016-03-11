package chapter01;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		char[] c = new char[3];
		System.out.println(c);
		System.out.println(c[0]);
		c[0] = 'B';
		System.out.println(c);
		System.out.println(c.length);
		
		//배열객체의 참조값
		System.out.println(System.identityHashCode(c));                                      String a = null; a.hashCode()
		System.out.println(c.hashCode());
		
		int[] intArray = new int[5];
		System.out.println(intArray);
		
		//int[] A;
		//A = {1,2,3}; error이유: 초기화는 처음 선언할 때만 가능
		
		//Array 유틸리티 클래스 사용
		int[] intArray5 = {1,2,3,4,5,6};
		int index = Arrays.binarySearch(intArray5, 5); //sorting 후 써야 한다.
		System.out.println(index);
		
		int[] intArray6 = {6,4,2,5,8,1};
		System.out.println(intArray6);//println은 integer배열을 받는 게 없다. 저 안에 있는 값만 출력하게 되어 있다. (참조값)
		//대신 object를 받는 게 있다.
		Arrays.sort(intArray6);
		System.out.println(Arrays.toString(intArray6));
		System.out.println(intArray6);
			
		int[] intArray7 = {6,4,2,5,8,1};
		System.out.println(intArray7);
		System.out.println();
		
		//그외: equals, fill
		
		//copy
		int[] src = {1,2,3,4,5};
		int[] dest = src;
		
		//Arrayutil.java확인
		int [] d;
		d = Arrayutil.concat2(intArray6, intArray7);
		System.out.println(Arrays.toString(d));
		
		

	}

}
