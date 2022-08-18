package vitals.util;

import vitals.language.Languages;
import vitals.thresholds.BMSCalculation;
import vitals.thresholds.BMSValues;

public class BMSUtil {
    public static boolean batteryConditionCheck(float value, BMSCalculation bMSCalculation, Languages languages) {
        boolean batteryHelathState =true;
        BMSValues bmsValues = bMSCalculation.bmsManipulation();
        batteryHelathState = batteryHealthStatus(value,batteryHelathState,bmsValues);
        message(value,bMSCalculation,languages);
        return batteryHelathState;
    }

    private static boolean batteryHealthStatus(float value,boolean healthStatus ,BMSValues bmsValues){
        if(value < bmsValues.getMin() || value >bmsValues.getMax()) {
            healthStatus = false;
        }
        return healthStatus;
    }

    private static void message(float value, BMSCalculation bMSCalculation, Languages languages) {
        if(!Languages.OTHERS.equals(languages)) {
            LanguagePrint.printStatus(ThresholdDefiner.getPropertyStatus(value,bMSCalculation),languages);
        }
    }

}
