package GroupHW;

public interface Shape {

//	Create an Interface ‘Shape’ with undefined methods
//	as calculateArea and calculatePerimiter.
//	Create 2 classes Circle & Square that implements
//	functionality defined in the Shape Interface.
//	Test your code.
	
	static double pi=3.14;
void calculateArea(int  a);
void calculatePerimiter(int a);
}
class Circle1 implements Shape{
	@Override
	public void calculateArea(int a) {
		
		double calculateArea=pi*a*a;
		System.out.println("The area of circle is "+calculateArea);
		
	}
	@Override
	public void calculatePerimiter(int a) {
	
	double calculatePerimiter=2*pi*a;
	System.out.println("The perimiter of circle is "+calculatePerimiter);
		System.out.println();
	}
	
}
class Square1 implements Shape{
	@Override
	public void calculateArea(int a) {
		double calculateArea=a*a;
		System.out.println("The area of square is "+(a*a));
	}
	@Override
	public void calculatePerimiter(int a) {
		double calculatePerimiter=4*a;
		System.out.println("The perimeter of square is "+(4*a));
		
	}

}
