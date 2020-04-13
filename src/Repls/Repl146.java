package Repls;

public class Repl146 {
	 public Repl146(String city){
	     System.out.println(city);
	   }

	   public Repl146(){
	     System.out.println("Parent Constructor");
	   }

}

   class Child extends Repl146{
	  Child(String city){
	    super(city);
	  }
	
   
   public static void main(String[] args) {
	    Child cc= new Child("Vienna");
	  }
   
   } 
