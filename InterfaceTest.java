public class InterfaceTest {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.checkPayment();
        payment.scanToPay();
        payment.googlePay();
        payment.payCOD();
        System.out.println("-----------");
        Student2 stud = new Student2();
        stud.haveSomePhysio();
        stud.meditate();
        stud.practice();
    }
}
//interfaces in JAVA
/*

interface is a PURE abstract class
- means all methods are by default public and abstract
and no scope for non-abstract methods
 */

interface NetPractice {
    void practice();
}
interface Meditation {
    void meditate();
}
interface Physio {
    void haveSomePhysio();
}
class Student2 implements NetPractice,Meditation,Physio
{
    public void practice() {
        System.out.println("Yes im doing net practice...");
    }

    @Override
    public void meditate() {
        System.out.println("Im meditating...");
    }

    @Override
    public void haveSomePhysio() {
        System.out.println("Im having some physio....");
    }
}
interface PhotoGraph
{
    void checkRecentPhoto();
}
interface Signature {
    void signatureMustMatch();
}
interface BalanceMatch {
    void maintainMinimumBalance();
}
interface WithdrawLimit {
    void cannotWithdrawMoreThan10K();
}
class OpenBankAccount implements BalanceMatch,WithdrawLimit, PhotoGraph, Signature
{

    @Override
    public void checkRecentPhoto() {

    }

    @Override
    public void signatureMustMatch() {

    }

    @Override
    public void maintainMinimumBalance() {

    }

    @Override
    public void cannotWithdrawMoreThan10K() {

    }
}
interface Gpay {
    void googlePay();
}
interface UPI {
    void scanToPay();
}
interface ChequePay {
    void checkPayment();
}
interface CashPay {
    void payCOD(); //cash on delivery
}
// if u purchase mobile phone on internet
//payment has below options

class Payment implements Gpay,UPI,ChequePay,CashPay
{
    @Override
    public void googlePay() {
        System.out.println("Doing google pay..");
    }

    @Override
    public void scanToPay() {
        System.out.println("doing scan to pay....");
    }

    @Override
    public void checkPayment() {
        System.out.println("doing check payment");
    }

    @Override
    public void payCOD() {
        System.out.println("doing cash on delivery..");
    }
}