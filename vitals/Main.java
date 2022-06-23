package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate, BatteryHealth batteryHealth) {
        return batteryHealth.healthStatus(temperature,soc,chargeRate);
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f,BatteryHealthManipulator.valueOf("TEMPERATURE")) == true);
        assert(batteryIsOk(55, 89, 0.0f,BatteryHealthManipulator.valueOf("TEMPERATURE")) == false);
        assert(batteryIsOk(25, 69, 0.7f,BatteryHealthManipulator.valueOf("CHARGE_STATE")) == true);
        assert(batteryIsOk(25, 85, 0.0f,BatteryHealthManipulator.valueOf("CHARGE_STATE")) == false);
        assert(batteryIsOk(25, 70, 0.9f,BatteryHealthManipulator.valueOf("CHARGE_RATE")) == false);
        System.out.println("Some more tests needed");
    }
}
