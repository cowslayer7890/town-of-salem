package org.kihcow.town;

public class StringUtils {
    public static String plural(String units, int number){
        return units + " " + (number == 1 ? "":"s");
    }
}
