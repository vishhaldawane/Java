import java.awt.*;

public class CounterThreadTest {
    public static void main(String[] args) {
        //3 create the object of your thread
        CounterFrame counterFrame1 = new CounterFrame(1,10000,200,200,100,100);
        CounterFrame counterFrame2 = new CounterFrame(5000,60000,200,200,100,600);

        counterFrame1.setVisible(true);
        counterFrame2.setVisible(true);

        //4 create object of Thread class
        Thread thread1 = new Thread(counterFrame1);
        Thread thread2 = new Thread(counterFrame2);


        //5 invoke the start()      // you have to dig out it
        thread1.start(); // errors are putting some facts in front of you
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e) {
            System.out.println("Problem "+e);
        }
    }
}
class CounterFrame extends Frame implements Runnable //1
{
    private int minCounterValue;
    private int maxCounterValue;

    TextField tf = new TextField(20);// width is 20 digits

    public CounterFrame(int minCounterValue, int maxCounterValue, int w, int h, int x, int y) {
        this.minCounterValue = minCounterValue;
        this.maxCounterValue = maxCounterValue;
        setLocation(x,y);
        setSize(w,h);
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        add(tf);


    }
    //2 - mandatory now
    public void run() {
        //counter(); // part of the 2nd step
        for(int i=minCounterValue; i<=maxCounterValue; i++) {
            //System.out.println("counter "+i);
            tf.setText("Counter "+i);
        }
    }
    /*void counter() {
        for(int i=minCounterValue; i<=maxCounterValue; i++) {
            //System.out.println("counter "+i);
            tf.setText("Counter "+i);
        }
    }*/

}


/*
I. Threading via java.lang.Thread class
1. WAC to extends Thread
2. override run method <-- run will call your function
3. make the object of your class of step 1
4. invoke the start() method of your class's object of step 1

II. Threading via java.lang.Runnable interface

1. implement java.lang.Runnable interface
2. mandate to define the run() method - your code from run
3. make the object of your class of step 1
        CounterThread ct = new CounterThread();
4. make the object of java.lang.Thread class - pass your object to its constructor
        Thread t = new Thread(ct);
5. invoke the start method of t -> t.start() which will call ct's run()


            java.lang.Runnable
              | 1     | public void run(); <--declared
              |       |
              |    java.lang.Thread
       Frame  |          | public void run() { } <-- defined here
        |     |          | public void start() { }
     CounterThread     Boat | Airplane | LoadingTruck | Railway
     2. run(){}
3. CounterThread ct = new CounterThread();
4. Thread t = new Thread(ct); <-- c is Runnable <-- who has the run method()
5. t.start();

In java we have scope of three types of classes

    1. regular class        2. abstract class   3. interface
    |                       |                       |
    Car                     SedanVehicle            Vehicle

    interface Vehicle {
            void move();
    }

    abstract class SedanVehicle implements Vehicle {
            abstract void drive();
    }

    class Car extends SedanVehicle {
            void drive() { } //mandate from SedanVehicle
            public void move(){ } //mandate from Vehicle
            void playRadioInCar() {
            }
    }

    "THINKING" IN JAVA

                        Vehicle
                            | move();
            -------------------------------------
            |               |                   |
            SedanVehicle    TrackVehicle        AirVehicle
            |               |changeTrack();    |fly();
       ---------        ---------           ------------
       |                |       |           |           |
       Car              Train   MonoRail    Helicopter  Flight
       |                |                       |           |
   --------         -------             ----------         -----
   |                |                    |                  |
 SkodaCar       BulletTrain     CobraHeliCopter     FighterJet


                BankAccount
                |
          ---------------
          |
          Savings
          |
        FixedDeposit

                Doctor
                |
         -------------
         |
         Surgeon
         |
    -----------
    |
    HeartSurgeon

    Every Surgeon is a Doctor- valid line
    Every Doctor is a Surgeon - invalid line

        Car on Ocean
        Car on Air
        Car on Road

 */
