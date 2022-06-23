package vitals;

public interface BatteryHealth {
    boolean healthStatus(float temperature,float soc,float chargeRate);
}
