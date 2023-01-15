package pjohanson.interfaces;

import java.util.Arrays;

public class StringVolume implements Comparable {
    String str;

    public StringVolume(String str) {
        this.str = str;
    }

    public int getValueAsInt() {
        long upperCase = Arrays.asList(str).stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .count();
        long lowerCase = Arrays.asList(str).stream()
                .filter(s -> Character.isLowerCase(s.charAt(0)))
                .count();

        long total = lowerCase + upperCase;
        int volume = Math.round((float)upperCase / (float)total) * Integer.MAX_VALUE;
        return volume;
    }

    @Override
    public String toString() {
        return str;
    }
}
