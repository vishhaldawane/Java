//observe below example too
// im on mute
interface ElectricityCheck {
    void checkingElectricity();
}
interface WaterCheck {
    void checkWaterAvailability();
}
interface SoapCheck {
    void checkSoapForFrontOrTopLoad();
}
interface ClothType {
    void isolateWhiteClothes();
}
class WashingClothes implements ClothType,WaterCheck,SoapCheck,ElectricityCheck
{

    @Override
    public void checkingElectricity() {

    }

    @Override
    public void checkWaterAvailability() {

    }

    @Override
    public void checkSoapForFrontOrTopLoad() {

    }

    @Override
    public void isolateWhiteClothes() {

    }
}
public class WashingTest {
    public static void main(String[] args) {

    }
}
