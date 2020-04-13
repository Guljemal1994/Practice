package Repls;

public class Repl164 {

	public static final double avgElements(int[] array){
		 double m=0;
		 double gul = 0;
			for(int values:array){
				m=m+values;
				 gul=m/array.length;
			}
			return gul;
		}
	
	
	public static void main(String[] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	
	
 
}
