package vitals.util;

import vitals.language.Languages;

import java.util.HashMap;
import java.util.Map;

public class AlertMessages {
    static {
        populateLanguageText();
    }
    static Map<Languages, Map<String, String>> localization;

    public  static Map<String, String> getLocalization(Languages language) {
        return localization.get(language);
    }

    public static void populateLanguageText() {
        Map<String, String> engText = new HashMap<>();

        engText.put("LOW_BREACH_SOC", "BREACH::: ====> State of Charge is out of range!");
        engText.put("LOW_WARNING_SOC", "WARNING::: ====> State of Charge is approaching for discharge!");
        engText.put("NORMAL_SOC", "NORMAL::: ====> State of Charge is in range!");
        engText.put("HIGH_WARNING_SOC", "WARNING::: ====> State of Charge is approaching for charge-peak!");
        engText.put("HIGH_BREACH_SOC", "BREACH::: ====> State of Charge is out of range!");

        engText.put("LOW_BREACH_TEMP", "BREACH::: ====> Temperature  is out of range!");
        engText.put("LOW_WARNING_TEMP", "WARNING::: ====> Temperature  is approaching for breach!");
        engText.put("NORMAL_TEMP", "NORMAL::: ====> Temperature  is in range!");
        engText.put("HIGH_WARNING_TEMP", "WARNING::: ====> Temperature  is approaching for breach!");
        engText.put("HIGH_BREACH_TEMP", "BREACH::: ====> Temperature is out of range!");

        engText.put("LOW_BREACH_CR", "BREACH::: ====> Charge Rate  is out of range!");
        engText.put("LOW_WARNING_CR", "WARNING::: ====> Charge Rate is approaching for breach!");
        engText.put("NORMAL_CR", "NORMAL::: ====> SCharge Rate is in of range!");
        engText.put("HIGH_WARNING_CR", "WARNING::: ====> Charge Rate is approaching for breach!");
        engText.put("HIGH_BREACH_CR", "BREACH::: ====> Charge Rate is out of range!");

        Map<String, String> germanText = new HashMap<>();

        germanText.put("LOW_BREACH_SOC", "BREACH::: ====> Der Ladezustand ist außerhalb des Bereichs!");
        germanText.put("LOW_WARNING_SOC", "WARNUNG::: ====> Der Ladezustand nähert sich einer Verletzung!");
        germanText.put("NORMAL_SOC", "NORMAL::: ====> Ladezustand ist in Reichweite!");
        germanText.put("HIGH_WARNING_SOC", "WARNUNG::: ====> Der Ladezustand nähert sich einer Verletzung!");
        germanText.put("HIGH_BREACH_SOC", "BREACH::: ====> Der Ladezustand ist außerhalb des Bereichs!");

        germanText.put("LOW_BREACH_TEMP", "BREACH::: ====> Temperatur außerhalb des zulässigen Bereichs!");
        germanText.put("LOW_WARNING_TEMP", "WARNUNG::: ====> Die Temperatur nähert sich dem Durchbruch!");
        germanText.put("NORMAL_TEMP", "NORMAL::: ====> Temperatur ist im Bereich!");
        germanText.put("HIGH_WARNING_TEMP", "WARNUNG::: ====> Die Temperatur nähert sich dem Durchbruch!");
        germanText.put("HIGH_BREACH_TEMP", "BREACH::: ====> Temperatur außerhalb des zulässigen Bereichs!");

        germanText.put("LOW_BREACH_CR ", "BREACH::: ====> Die Laderate ist außerhalb des zulässigen Bereichs!");
        germanText.put("LOW_WARNING_CR ", "WARNUNG::: ====> Die Laderate nähert sich der Verletzung!");
        germanText.put("NORMAL_CR ", "NORMAL::: ====> DISCharge Rate liegt im Bereich!");
        germanText.put("HIGH_WARNING_CR ", "WARNUNG::: ====> Die Laderate nähert sich der Verletzung!");
        germanText.put("HIGH_BREACH_CR ", "BREACH::: ====> Die Laderate ist außerhalb des zulässigen Bereichs!");

        localization = new HashMap<>();
        localization.put(Languages.ENGLISH,engText);
        localization.put(Languages.GERMAN,germanText);
    }
}
