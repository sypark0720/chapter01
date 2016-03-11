package chapter01;

import java.util.Scanner;

public class NhelloWorld {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i=1; i<=count;i++){
			System.out.println("HelloWorld");
		}
		
	}
}
