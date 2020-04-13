package GroupHW;

public abstract class ExampleTask2 {

	/*
	 * We have to calculate the average of marks obtained in three subjects by student A and by student B.
	 *Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks.
	 *Provide implementation of abstract method in classes ‘A’ and ‘B’. 
	 *The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as 
	 *its parameters for student B. Test your code
	 */
	
	int piano;
	int art;
	int languages ;
	int music;
	int count;
	
ExampleTask2(int piano, int art, int languages){
		this.piano = piano;
		count++;
		this.art = art;
		count++;
		this.languages = languages;
		count++;
	}
ExampleTask2(int piano, int art, int languages,int music){
		this.piano = piano;
		count++;
		this.art = art;
		count++;
		this.languages = languages;
		count++;
		this.music = music;
		count++;
	}
    public	abstract double getPercentage();
}
class  StudentAa extends ExampleTask2{
    
	StudentAa(int piano, int art, int languages) {
		super(piano, art, languages);
	}
	@Override
  public double getPercentage() {
    double average;
	average =((piano+art+languages)/super.count);
	System.out.print("average "+super.count+" is:");
	return average;
}
 }

class StudentBb extends ExampleTask2{
 
	StudentBb(int piano, int art, int languages, int music) {
		super(piano, art, languages, music);
		
	}
	@Override
	  public double getPercentage() {
		double average;
		average =((piano+art+languages+music)/super.count);
		System.out.print("averages "+super.count+" is:");
		return average;
		}	
	  }

















