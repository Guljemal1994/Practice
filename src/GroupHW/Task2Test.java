package GroupHW;

public class Task2Test {

	public static void main(String[] args) {

		
	StudentA student1=new StudentA(80,90,95);
	double averageP=student1.getPercentage();
	System.out.println(averageP+" % ");
	System.out.println();
	
	StudentB student2=new StudentB(90,89,95,90);
	averageP=student2.getPercentage();
	System.out.println(averageP+" %"); 
			}
		}

