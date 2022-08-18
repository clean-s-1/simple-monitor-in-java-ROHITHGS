package vitals;

import vitals.language.Languages;
import vitals.thresholds.ChargeRateManipulator;
import vitals.thresholds.SOCCManipulator;
import vitals.thresholds.TemperatureManipulator;
import vitals.util.BatteryInfo;

public class Main {
    static boolean batteryIsOk(float value, BatteryInfo batteryInfo, Languages languages) {
        if(batteryInfo==BatteryInfo.TEMPERATURE) {
            return new TemperatureManipulator().defineBatteryStatus(value,languages);
        } else if(batteryInfo==BatteryInfo.CHARGE_STATE) {
            return new SOCCManipulator().defineBatteryStatus(value,languages);
        } else {
            return new ChargeRateManipulator().defineBatteryStatus(value,languages);
        }
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, BatteryInfo.TEMPERATURE,Languages.ENGLISH)==true);
        assert(batteryIsOk(50, BatteryInfo.TEMPERATURE, Languages.GERMAN) == false);
        assert(batteryIsOk(70, BatteryInfo.CHARGE_STATE,Languages.GERMAN) == true);
        assert(batteryIsOk(85, BatteryInfo.CHARGE_STATE, Languages.OTHERS) == false);
        assert(batteryIsOk(0.9f, BatteryInfo.CHARGE_RATE, Languages.ENGLISH) == false);
        System.out.println("Tested");
    }
}
