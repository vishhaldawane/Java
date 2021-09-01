
public class CricketTest {
    public static void main(String[] args) {
        Cricketer cricketerObj1 = new Cricketer('M',44,"Sachin Tendulkar",12000,89.0f,400,200,600,500,120,100);
        System.out.println("cricketerObj1 :  "+cricketerObj1);
        /*cricketerObj1.ball();
        cricketerObj1.bat();
        cricketerObj1.field();
        cricketerObj1.run();*/
        System.out.println("---------------");
        Batting b1 = cricketerObj1; //interface hanlde can point to the child
        Running r1 = cricketerObj1;
        b1.bat();
       // b1.run(); - this is the important aspect of the interface
        r1.run();
        //r1.bat();

        System.out.println("-----------");
        Cricketer cricketerObj2 = new Cricketer('M',42,"Sanath Jaysurya",11000,85.0f,420,210,670,550,110,120);
        System.out.println("cricketerObj2 :  "+cricketerObj2);
        /*cricketerObj2.ball();
        cricketerObj2.bat();
        cricketerObj2.field();
        cricketerObj2.run();*/
        System.out.println("-----------");
        Balling b2 = cricketerObj2;
        b2.ball();
        Running r2 = cricketerObj2;
        r2.run();
        Fielding f2 = cricketerObj2;
        f2.field();

        System.out.println("=======50 overs done =======");
        Batting b3 = cricketerObj2;
        b3.bat();
        Running r3 = cricketerObj2;
        r3.run();

        System.out.println("--------");
        Balling b4 = cricketerObj1;
        b4.ball();
        Running r5 = cricketerObj1;
        r5.run();
        Fielding f5 = cricketerObj1;
        f5.field();

        //if u watch the match, both the teams
        //Srilankan team    vs   India
        //  JaySurya        vs        Sachin and 10 players - batsman role
        //  Fielding        vs        Batting
        //  Batting         vs        Fielding


    }
}
interface Batting {
    void bat();
}
interface Balling {
    void ball();
}
interface Running {
    void run();
}
interface Fielding {
    void field();
}
class Person {
    char gender; int age; String name;

    public Person(char gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cricketer extends Person implements Batting, Balling, Running, Fielding {
    int totalScoreTillNow;
    float strikeRate;
    int numberOfCenturies;
    int numberOfHalfCenturies;
    int numberOfSixers;
    int numberOfFours;
    int numberOfODI;
    int numberOfTest;
//                     <----Person------> <------Cricketer......
    public Cricketer(char gender, int age, String name, int totalScoreTillNow, float strikeRate, int numberOfCenturies, int numberOfHalfCenturies, int numberOfSixers, int numberOfFours, int numberOfODI, int numberOfTest) {
        super(gender, age, name); // utilize super class contructor
        this.totalScoreTillNow = totalScoreTillNow;
        this.strikeRate = strikeRate;
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
        this.numberOfSixers = numberOfSixers;
        this.numberOfFours = numberOfFours;
        this.numberOfODI = numberOfODI;
        this.numberOfTest = numberOfTest;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", totalScoreTillNow=" + totalScoreTillNow +
                ", strikeRate=" + strikeRate +
                ", numberOfCenturies=" + numberOfCenturies +
                ", numberOfHalfCenturies=" + numberOfHalfCenturies +
                ", numberOfSixers=" + numberOfSixers +
                ", numberOfFours=" + numberOfFours +
                ", numberOfODI=" + numberOfODI +
                ", numberOfTest=" + numberOfTest +
                '}';
    }

    @Override
    public void bat() {
        System.out.println(name+" is batting...");
    }

    @Override
    public void ball() {
        System.out.println(name+" is balling...");
    }

    @Override
    public void run() {
        System.out.println(name+" is running...");
    }

    @Override
    public void field() {
        System.out.println(name+" is fielding...");
    }
}
//if indian is playing as a bat first
//if shrilanka is playing as a field first

//22 players
// is every Batsman a Cricketer
