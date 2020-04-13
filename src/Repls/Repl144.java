package Repls;

public class Repl144 {

	
	String name;
	 String lastName;
	 int age;
	 
}
	class Employee extends Repl144{
	  
	  int salary ;

 void  employee() {

		System.out.println(name+" "+lastName+" "+age+" "+salary);
	} 
	}
	
	class Student  extends Employee{
		int grade;
	void student () {
		System.out.println(name+" "+lastName+" "+age+" "+grade);
		}
	}
	
	class Retiree extends Student{
		String seniorActivity;
		void  retiree() {
	
			System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
		}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name="Joe";
		emp.lastName= "Smith";
		emp.age = 35;
		emp.salary = 35000;
		emp.employee();
		
		Student st = new Student();
		st.name = "Adem";
		st.lastName = "Smith";
		st.age = 15;
		st.grade = 10;
		st.student();
			
		Retiree ret = new Retiree();
		ret.name = "Frunk";
		ret.lastName = "Smith";
		ret.age = 35;
		ret.seniorActivity = "tour";
		ret.retiree();
			
		}}
