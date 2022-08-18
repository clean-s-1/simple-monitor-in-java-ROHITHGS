package vitals.thresholds;

import java.util.Map;

public class BMSValues {

    private float min;
    private float max;
    private float tolerance;
    private Map<ThreshHoldLevel,String> toleranceText;

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getTolerance() {
        return tolerance;
    }

    public void setTolerance(float tolerance) {
        this.tolerance = tolerance;
    }

    public Map<ThreshHoldLevel, String> getToleranceText() {
        return toleranceText;
    }

    public void setToleranceText(Map<ThreshHoldLevel, String> toleranceText) {
        this.toleranceText = toleranceText;
    }

    @Override
    public String toString() {
        return "BMSValues{" +
                "min=" + min +
                ", max=" + max +
                ", tolerance=" + tolerance +
                ", toleranceText=" + toleranceText +
                '}';
    }
}
