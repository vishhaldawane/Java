public class OverridingTest {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.farming();
    }
}
class GrandFather
{
    void farming() { //inherited to the Child class
        System.out.println("Traditional farming..with Bulls");
    }
}
class Father extends GrandFather {
    void farming() { //overriding(hiding) the GrandFather's farming
        System.out.println("Farming...with Tractor");
    }
}
class Child extends Father { //john deere - pune - 15 days
    /*void farming() {
        System.out.println("Modern farming with Robo.Tractor..");
    }*/
}
