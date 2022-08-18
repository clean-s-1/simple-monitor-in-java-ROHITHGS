package vitals.util;

import vitals.thresholds.BMSCalculation;
import vitals.thresholds.ThreshHoldLevel;

public class ThresholdDefiner {
    static ThreshHoldLevel getLevel(float value, float min, float max) {
        if (value < min) {
            return ThreshHoldLevel.LOW_BREACH;
        } else if (value < max) {
            return ThreshHoldLevel.NORMAL;
        }
        return ThreshHoldLevel.HIGH_BREACH;
    }


    static float getTolerance(float max, float tolerance)  {
        return (max * tolerance) / 100;
    }

    public static boolean isNormalLevel(ThreshHoldLevel level){
        return level == ThreshHoldLevel.NORMAL;
    }

    static ThreshHoldLevel checkWarningLevel(float value, float minTolerance, float maxTolerance){
        if (value <= minTolerance) {
            return ThreshHoldLevel.LOW_WARNING;
        } else if (value >= maxTolerance) {
            return ThreshHoldLevel.HIGH_WARNING;
        }
        return ThreshHoldLevel.NORMAL;
    }

    public static String getPropertyStatus (float value, BMSCalculation bMSCalculation){

        float toleranceVal = getTolerance(bMSCalculation.bmsManipulation().getMax(),  bMSCalculation.bmsManipulation().getTolerance());
        ThreshHoldLevel level = getLevel(value, bMSCalculation.bmsManipulation().getMin(), bMSCalculation.bmsManipulation().getMax());
        boolean isInRange = isNormalLevel(level);
        if (isInRange) {
            level = checkWarningLevel(value, bMSCalculation.bmsManipulation().getMin() + toleranceVal,bMSCalculation.bmsManipulation().getMax() - toleranceVal);
        }
        return bMSCalculation.bmsManipulation().getToleranceText().get(level);
    }
}
