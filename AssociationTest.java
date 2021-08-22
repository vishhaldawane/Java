
public class AssociationTest {
	public static void main(String[] args) {
		int age = 20;
		char gender = 'F';
		String name = "Julie";
		
		System.out.println("age    : "+age);
		System.out.println("gender : "+gender);
		System.out.println("name   : "+name);
		
		int age1 = 42;
		char gender1 = 'M';
		String name1 = "Vijay";
		
		System.out.println("age    : "+age1);
		System.out.println("gender : "+gender1);
		System.out.println("name   : "+name1);
		
		int age2 = 35;
		char gender2 = 'F';
		String name2 = "Pratima";
		
		System.out.println("age    : "+age2);
		System.out.println("gender : "+gender2);
		System.out.println("name   : "+name2);
		
		
	}
}




















class Person
{
	private char gender; //data
	private int age;	 //data
	private String name; //data
	
	void setPerson(char g, int a, String n) {
		gender = g;
		age = a;
		name = n;
	}
	
}
