
public class AssociationTest {
	public static void main(String[] args) {
		/*int age = 20;
		char gender = 'F';
		String name = "Julie";
		
		System.out.println("[age    ]: "+age);
		System.out.println("[gender ]: "+gender);
		System.out.println("[name   ]: "+name);
		
		int age1 = 42;
		char gender1 = 'M';
		String name1 = "Vijay";
		
		System.out.println("[age    ]: "+age1);
		System.out.println("[gender ]: "+gender1);
		System.out.println("[name   ]: "+name1);
		
		int age2 = 35;
		char gender2 = 'F';
		String name2 = "Pratima";
		
		System.out.println("[age    ]: "+age2);
		System.out.println("[gender ]: "+gender2);
		System.out.println("[name   ]: "+name2);
		*/

		Person p1 = new Person(); //make an object out of the design
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setPerson('F', 22, "Julie","Dsouza"); //set the object
		p1.vc.setVoterCard("123123123","Govt Of Nepal","Julie D");
		p1.showPerson();			//print the object contents
		
		p2.setPerson('M',34, "Vijay","Shreshta");
		p2.vc.setVoterCard("223223223","Govt Of America","Vijay S");
		p2.showPerson();
		
		p3.setPerson('F',30, "Pratima","Shreshta");
		p3.vc.setVoterCard("423423423","Govt Of America","Pratima VS");
		p3.showPerson();
	}
}

class VoterCard
{
	String votingCardNumber;
	String issuedBy;
	String voterName;
	
	void setVoterCard(String vcn, String ib, String vn) {
		votingCardNumber = vcn;
		issuedBy = ib;
		voterName=vn;
	}
	void showVoterCard() {
		System.out.println("[Voting Card Number    : ] "+votingCardNumber);  //intelliJ is rapid as compared to eclipse 
		System.out.println("[Voting Card Issued by : ] "+issuedBy);  
		System.out.println("[Voter name            : ] "+voterName);  
	}
	
}
class Animal // every animal is not  mammal
{
	
}
class Mammal extends Animal //but every mammal is an animal		isA
{						//every mammal is not a humam
	
}
class Human extends Mammal // every human is a mammal			isA
{
	
}
class Person extends Human 									//	 isA
{
	char gender; //data memebr - field 
	int age;	 //data
	String name; //data
	String surname;
	VoterCard vc= new VoterCard();  //hasA relationship
	//mutator
	void setPerson(char g, int a, String n, String sn) { //member methods - functions
		gender = g;
		age = a;
		name = n;
		surname = sn;
	}
	//accessor - read only contract
	void showPerson() {
		System.out.println("[gender  ] "+gender);
		System.out.println("[age     ] "+age);
		System.out.println("[name    ] "+name);
		System.out.println("[surname ] "+surname);
		vc.showVoterCard();
		System.out.println("-------------------------------");
	}
}

class Student extends Person {
	
}
class Employee extends Student {
	
}
class Executive extends Employee {
	
}
class Manager extends Executive {		
	
}
class Director extends Manager { // seminar only for Director
	
}
class Founder extends Director {
	
}


