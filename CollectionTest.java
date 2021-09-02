/*
        Collection  - similar to a Bag, Sag, Box, Container
        3 things

        In what will you hold your laptop -> while carrying -> laptop bag

            ---------
            |       |
            |       | @
            |       || |
            ---------| |

      * 1. Content      Whisky      Soup         CocaCola    CoconutWater    FriedRice   Noodles     Pickle/Shrikhand    Water
        2. Container    YShapeGlass Bowl         Bottle      Coconut         Plate       Bowl        Plate/bowl          WaterBottle[Nikhil STd Div Rollno]
        3. Iterator                 SpecialSpoon Straw       Straw           Spoon       ChopSticks  finger finger       Straw
      * 4. Algorithm    sip()       drink()         eat()       eat()       lick() lickAndEat() drink()

                    Pratima
    You at dining ------------- drink();
                /            / |
                ------------    You <---------------   Waiter  Bottle[Content]+Straw
                |           |
    Content is hold by the Container
    Container provides the Iterator

            C O M P O N E N T S   O R T H O G O N A L    S P A C E

                                        CONTENT
                                         |          ButterMilk
                                         |          int, float
                                       /   \
                                     /      \
                                    /        \
                            CONTAINER ---|----ALGORITHM
                            |            |          |
                            glass      ITERATOR     drink
                                         Straw
                           int []       for         printing, sorting, searchin
                           float[]      for         printing

       arraylist, linked list, treeset, hashset, hashmap, treemap
       comparator, comparable
 */
public class CollectionTest {
    public static void main(String[] args) {
        //content
        //int num1=10; int num2=20; int num3=3; int num4=7; int num5=12;

        int myScore[]= {10,20,3,7,12}; //<-1.content + 2.container -> int []

        //3. iterator
        for(int i=0;i<myScore.length;i++) {
            System.out.println("value : "+myScore[i]); //4. algorithm
        }
        System.out.println("--------------");
        double myStrikeRate[]= {10.5,20.4,3.6,7.6,12.6}; //<-1.content + 2.container -> int []

        //3. iterator
        for(int i=0;i<myStrikeRate.length;i++) {
            System.out.println("value : "+myStrikeRate[i]); //4. algorithm
        }
        System.out.println("---------");
        String cities[]={"New York","Kathmandu","New Delhi","New Mumbai"};
        for(int i=0;i<cities.length;i++) {
            System.out.println("value : "+cities[i]); //4. algorithm
        }
    }
}
