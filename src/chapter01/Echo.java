package chapter01;

public class Echo {

	public static void main(String[] args) {
		for( int i = 0; i < args.length; i++){ 
		       System.out.println( args[ i ] ); 
		    } 

		for (String arg: args){
			//args의 각각의 element 요소들을 하나씩 변경해간다-for each문
			System.out.println(arg);
		}
		
	}

}
