package vitals.thresholds;

import vitals.language.Languages;
import vitals.util.BMSUtil;

import java.util.HashMap;
import java.util.Map;

public class TemperatureManipulator implements BMSCalculation{
    static BMSValues bmsValues;
    static  {
        bmsValues = new BMSValues();
        bmsValues.setMin(0);
        bmsValues.setMax(45);
        bmsValues.setTolerance(5);
        Map<ThreshHoldLevel,String> toleranceText = new HashMap<>();
        toleranceText.put(ThreshHoldLevel.LOW_BREACH,"LOW_BREACH_TEMP");
        toleranceText.put(ThreshHoldLevel.HIGH_BREACH,"HIGH_BREACH_TEMP");
        toleranceText.put(ThreshHoldLevel.LOW_WARNING,"LOW_WARNING_TEMP");
        toleranceText.put(ThreshHoldLevel.LOW_BREACH,"HIGH_BREACH_TEMP");
        toleranceText.put(ThreshHoldLevel.NORMAL,"NORMAL_TEMP");
        bmsValues.setToleranceText(toleranceText);
    }
    @Override
    public BMSValues bmsManipulation() {
        return bmsValues;
    }

    @Override
    public boolean defineBatteryStatus(float value, Languages message) {
        return BMSUtil.batteryConditionCheck(value,new TemperatureManipulator(),message);
    }
}
