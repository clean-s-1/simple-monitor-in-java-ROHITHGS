package vitals.util;

import vitals.language.Languages;

public class LanguagePrint {
    public static void  printStatus(String text, Languages languages) {
        printStatusUpdate(AlertMessages.getLocalization(languages).get(text));
    }

    public static void printStatusUpdate(String text){
        System.out.println(text);
    }
}
