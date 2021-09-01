/*
    1. extend from java.lang.Thread class [ Airplane, Boat, Car ]
    2. override its public void run method ( this method would be participated
            in the threading environment) - your code must be called from this method
    3. create the object of your class which has extended from java.lang.Thread in step1
    4. invoke/call the inherited start() method of java.lang.Thread class, which will
       invoke your overridden run() method
            THE REAL MAGIC IS IN START() METHOD FROM THREAD CLASS
            IT TALKS TO THE JAVA'S THREAD SCHEDULER TO WORK IN THREADED ENVIRONMENT
 */
class Airplane extends Thread /*1*/ {
    void flying() {
        for(int i=1;i<500;i++) {
            System.out.println("Airplane is flying..."+i+" aeronautical miles completed...");
        }
    }
    public void run() { //2
        flying(); //part of step 2
    }
}
class Car extends Thread {//1
    void driveMyCar() {
        for(int i=1;i<30;i++) {
            System.out.println("\t\tCar is running...."+i+" miles completed");
        }
    }
    public void run() { //2
        driveMyCar(); // part of step 2
    }
}

class Boat extends Thread { // 1
    void sailing() {
        for(int i=1;i<80;i++) {
            System.out.println("\tBoat is sailing.."+i+" nautical miles completed");
        }
    }
    public void run() { //2
        sailing(); // part of step 2
    }
}

//you are at marine drive....
// u can see, flight, boat and car


public class ThreadTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(); //step 3
        Boat boat = new Boat();         //step3
        Car car = new Car();            //step3

       // airplane.flying();
       // boat.sailing();
       // car.driveMyCar();

      //  airplane.run();
      //  boat.run();
      //  car.driveMyCar();

        airplane.start();
        boat.start();
        car.start();

    }
}
