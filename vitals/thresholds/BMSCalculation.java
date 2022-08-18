package vitals.thresholds;

import vitals.language.Languages;

public interface BMSCalculation {
    BMSValues bmsManipulation();
    boolean defineBatteryStatus(float value, Languages message);
}
