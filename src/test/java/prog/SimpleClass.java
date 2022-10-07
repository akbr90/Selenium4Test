package prog;

public class SimpleClass {
	int rollno;  
	String name;  
	float fee;  
	SimpleClass(int rollno,String name,float fee){  
		this();
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	SimpleClass(){
		//this(11,"Akbar",87000);
		System.out.println("Default constructor");
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	} 
	void display1() {
		this.display();
		display2(this);
	}
	void display2(SimpleClass s) {
		System.out.println("Display2()");
	}
	
	classC obj;
	SimpleClass(classC obj){
		this.obj=obj;
	}
	
	void display3() {
		System.out.println(obj.data);
	}
	

}  

class classC {

	int data = 10;
	classC(){
		SimpleClass obj = new SimpleClass(this);
		obj.display3();
	}
	
	abstract class classAbstract{
		
	}
	
	abstract class newAbstract extends classAbstract{
		
	}

}
