package day1.example;
class People{
	int age;
	String name;
	
	void method(int a,String n) {
		int i=a+10;
		String s= "Hello "+ n;
		System.out.println(i+"\n"+s);
	}
}

public class MyFirstClassic {
 
	public static void main(String[] args) {
		People p1=new People();
		People p2=new People();
		p1.age=10;
		p1.name="ab";
		p2.age=20;
		p2.name="abc";
		p1.method(44,"rr");
				
		

	}

}
