package Repls;

public class Main {

	public static final double avgElements(int [] arr ){
	    double avg=0;
	    double sum=0;
	    for ( int i=0; i<arr.length; i++){
	      sum+=arr[i];
	      avg=sum/(arr.length);
	    }
	    return avg;
	  }
		public static void main(String[] args) {
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		}
} 
