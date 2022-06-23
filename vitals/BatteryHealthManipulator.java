package vitals;

public enum BatteryHealthManipulator implements BatteryHealth {
    TEMPERATURE {
        @Override
        public boolean healthStatus(float temperature, float soc, float chargeRate) {
           boolean batteryTemperatureStatus = true;
           if(temperature <0 || temperature>45) {
               System.out.println("Temperature not in a range");
               batteryTemperatureStatus = false;
           }
           return batteryTemperatureStatus;
        }
    },
    CHARGE_STATE {
        @Override
        public boolean healthStatus(float temperature, float soc, float chargeRate) {
            boolean batterySocStatus = true;
            if(soc <20 || soc>80) {
                System.out.println("Charge State is out of range");
                batterySocStatus = false;
            }
            return batterySocStatus;
        }
    },
    CHARGE_RATE {
        @Override
        public boolean healthStatus(float temperature, float soc, float chargeRate) {
            boolean batteryChargeRateStatus = true;
            if(chargeRate>0.8) {
                System.out.println("Charge Rate is out of range");
                batteryChargeRateStatus = false;
            }
            return batteryChargeRateStatus;
        }
    }

}
