package chapter01;

public class Arrayutil {
	public static int[] concat(int[] a, int[] b){
		int[] c = null; //배열 합친다.
		int leng = a.length + b.length;
		c = new int[leng];
		
		for(int i=0; i<a.length; i++){
			c[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++){
			c[i+a.length]=b[i];
		}
				
		return c;
	}
	
	public static int[] concat2(int[] a, int[] b){
		int[] c; //배열 합친다.
		int leng = a.length + b.length;
		c = new int[leng];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
				
		return c;
	}	
	
	public static boolean equals(int[] a, int[] b) {
		return true;
	}
}
