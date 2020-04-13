package only.task;

public class Cat extends Animal {

	
	Cat (String name){
	    super (name);
	  }
	  public void sleep(){
	    System.out.println(name+" eats");
	    System.out.println(name+" sleeps a lot");
	  }
	}
	class Kitten1 extends Animal{
	  Kitten1(String name){
	    super(name);
	  }
	public void eat(){
	    System.out.println(name+ " eats milk");
	    System.out.println(name+" sleeps a lot ");
	  }
	}
	class Kitten2 extends Animal{
	  Kitten2(String name){
	    super(name);
	  }
	  public void eat(){
	    System.out.println(name+ " eats snacks");
	    System.out.println(name+" sleeps a lot ");
	  }
	}
	class Kitten3 extends Animal{
	  Kitten3 (String name){
	  super(name);
	}
	public void eat(){
	    System.out.println(name+ " eats everything");
	    System.out.println(name+" sleeps a lot ");
	  }
	}
