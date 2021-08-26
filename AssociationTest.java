/*
  Gold smith - gm 100 gm   500gm gold
  Milkman - litre
  Grocery -- kgs

  Java -- class

 */

public class AssociationTest { //isA - hasA  - usesA -  producesA
    public static void main(String[] args) {
        System.out.println("hello world");
       // Heart theHeartObj = new Heart();
        Person thePersonObj = new Person();
        thePersonObj.talking();
        thePersonObj.talking(30);
        thePersonObj.talking(10,"Julie");
        thePersonObj.talking("Smith");
        thePersonObj.talking("Sita",90);
        thePersonObj.myHeart.pumping();
        System.out.println("-----------------");
        Student theStudentObj = new Student(); //
        theStudentObj.myHeart.pumping();
        theStudentObj.talking();
        theStudentObj.talking(45);
        theStudentObj.studying();
    }
}
class Heart {
    void pumping() {
        System.out.println("Heart is pumping...");
    }
}
class Person {
    Heart myHeart = new Heart(); //hasA - vital part of any Person
    //function overloading, we can write multiple functions with same name, but they should be
    //differentiated based on following lines
    //1. type of parameter/argument
    //2. number of parameters/arguments
    //3. sequence of parameters/arguments
    //is return type included in this overloading ???
    void talking() {
        System.out.println("Person is talking...");
    }
    void talking(int i) {
        System.out.println("Person is talking...for "+i+" minutes");
    }
    void talking(String name) {
        System.out.println("Person is talking...with "+name);
    }
    void talking(int i, String name) {
        System.out.println("Person is talking...with "+name+" for "+i+" minutes");
    }
    void talking(String name,int i) {
        System.out.println("Person is talking...with "+name+" for "+i+" minutes");
    }
}
class Student extends Person  {//isA - every Student isA (has to be) Person
    void studying() {
        System.out.println("Student is studying....");
    }
}

