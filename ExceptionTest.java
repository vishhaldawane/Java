public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Begin main");
       MyCalculator myCalculator = new MyCalculator();
        int div1 = myCalculator.divide(10,3);
        System.out.println("division is "+div1);

        int div2 = myCalculator.divide(100,5);
        System.out.println("division is "+div2);

        int div3 = myCalculator.divide(25,0);
        System.out.println("division is "+div3);

        int div4 = myCalculator.divide(64,4);
        System.out.println("division is "+div4);

        System.out.println("End main");
    }
}
class MyCalculator
{
    int divide(int num, int deno) {
        System.out.println("\tinside divide");
        System.out.println("\tnum  : "+num);
        System.out.println("\tdeno : "+deno);
        int division=0;
        try {
            division = num / deno;
        }
        catch(ArithmeticException exception) {
            System.out.println("Cannot divide by zero...");
        }
        finally {
            System.out.println("=>finally : Is bound to be called regardless of the exception");
        }

            System.out.println("\tExiting divide");

        return division;
    }
}
/*                      Object
                            |
                    Throwable
                        |
                     -----------------
                     |              |
                Exception           Error
                    |1. can be caught
                    |2. checked -by the compiler
                    |3. u need throws clause if you are throwing these types
                    |
                 --------------------------------
                 |                  |           |
         RuntimeException       SQLException    IOException
                |
                | u dont need throws clause from a  method if throwing these type
                | unchecked - by the compiler
                |
          ----------------------------
            |                     |
    ArithmeticException  NullPointerException ...


 */