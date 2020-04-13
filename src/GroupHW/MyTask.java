package GroupHW;

public interface MyTask {
 
	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
	 * Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
	 * Test your code.
	 */
	
	static double gul= 2.1;
	
	void calculateArea(int a );
	void calculatePerimiter(int a);
}

class Circle implements MyTask{

	@Override
	public void calculateArea(int a) {
		double calculateArea = gul*a*a;
		System.out.println("Area of Circule = "+calculateArea);
	}

	@Override
	public void calculatePerimiter(int a) {
		double calculatePerimiter =2*gul*a;
		System.out.println("Parameter of Circule"+calculatePerimiter);
	     System.out.println();
	}
}

class Square implements MyTask{

	@Override
	public void calculateArea(int a) {
		double calculateArea = gul*a*a;
		System.out.println("Area of square = "+(a*a));
	}

	@Override
	public void calculatePerimiter(int a) {
		double calculatePerimiter =4*gul*a;
		System.out.println("Parimiter of Square = "+(4*a));
	}
	
	
}
