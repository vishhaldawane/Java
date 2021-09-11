public class ExceptionTest3 {
    //tdd
    public static void main(String[] args) {
        System.out.println("Begin main");
        try {
            Dog myDog1 = new Dog("Bruno", 18);
            System.out.println("my dog is " + myDog1);
        }
        catch(NegativeDogAgeException theException ) {
            System.out.println("Problem2 : "+theException.getMessage());
        }
        catch(DogAgeExceededException theException ) {
            System.out.println("Problem3 : "+theException.getMessage());
        }
        catch(RuntimeException theException ) {
            System.out.println("Problem1 : "+theException.getMessage());
        }
        catch(Exception theException ) {
            System.out.println("Problem1 : "+theException.getMessage());
        }

        System.out.println("End main");
    }
}

//custom exceptions - user defined exception

class NegativeDogAgeException extends RuntimeException {
    NegativeDogAgeException(String str) {
        super(str);
    }
}
class DogAgeExceededException extends RuntimeException {
    DogAgeExceededException(String str) {
        super(str);
    }
}
class Dog
{
    String name;
    int age;

    public Dog(String name, int age) {
        System.out.println("=>Dog(String,int) constructor started...");
        this.name = name;
        if(age<0) {
            //System.out.println("Dog's age cannot be in negative..."+age);
            NegativeDogAgeException exception = new NegativeDogAgeException("Dogs age cannot be in negative.."+age);
            throw exception;
        }
        else if ( age>16) {
            //System.out.println("Dog's age cannot exceed 16.."+age);
            DogAgeExceededException exception = new DogAgeExceededException("Dogs age cannot exceed 16.."+age);
            throw exception;
        }
        else {
            System.out.println("Setting the age as "+age);
            this.age = age;
        }
        System.out.println("=>Dog(String,int) constructor finished...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//BankAccount ba = new BankAccount(101,"J$#ck",9000); //5000 is min bal to open the bank account