package vitals.thresholds;

import vitals.language.Languages;
import vitals.util.BMSUtil;

import java.util.HashMap;
import java.util.Map;

public class SOCCManipulator implements BMSCalculation{
    static BMSValues bmsValues;
    static  {
        bmsValues = new BMSValues();
        bmsValues.setMin(20);
        bmsValues.setMax(80);
        bmsValues.setTolerance(5);
        Map<ThreshHoldLevel,String> toleranceText = new HashMap<>();
        toleranceText.put(ThreshHoldLevel.LOW_BREACH,"LOW_BREACH_SOC");
        toleranceText.put(ThreshHoldLevel.HIGH_BREACH,"HIGH_BREACH_SOC");
        toleranceText.put(ThreshHoldLevel.LOW_WARNING,"LOW_WARNING_SOC");
        toleranceText.put(ThreshHoldLevel.LOW_BREACH,"HIGH_BREACH_SOC");
        toleranceText.put(ThreshHoldLevel.NORMAL,"NORMAL_SOC");
        bmsValues.setToleranceText(toleranceText);
    }
    @Override
    public BMSValues bmsManipulation() {
        return bmsValues;
    }

    @Override
    public boolean defineBatteryStatus(float value, Languages message) {
        return BMSUtil.batteryConditionCheck(value,new SOCCManipulator(),message);
    }
}
