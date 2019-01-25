package tudelft.tw;

import java.util.HashMap;
import java.util.Map;

public class MyRoman {
    private static final Map<Character, Integer> map;
    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    static public int convert(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.isEmpty()) return 0;

        switch (romanNumeral.charAt(0)) {
            case 'I':
                if (romanNumeral.length() > 1) {
                    if (romanNumeral.charAt(1) == 'V') {
                        return 4 + MyRoman.convert(romanNumeral.substring(2));
                    } else if (romanNumeral.charAt(1) == 'X') {
                        return 9 + MyRoman.convert(romanNumeral.substring(2));
                    }
                }
                return 1 + MyRoman.convert(romanNumeral.substring(1));
            case 'X':
                if (romanNumeral.length() > 1) {
                    if (romanNumeral.charAt(1) == 'L') {
                        return 40 + MyRoman.convert(romanNumeral.substring(2));
                    } else if (romanNumeral.charAt(1) == 'C') {
                        return 90 + MyRoman.convert(romanNumeral.substring(2));
                    }
                }
                return 10 + MyRoman.convert(romanNumeral.substring(1));
            case 'C':
                if (romanNumeral.length() > 1) {
                    if (romanNumeral.charAt(1) == 'D') {
                        return 400 + MyRoman.convert(romanNumeral.substring(2));
                    } else if (romanNumeral.charAt(1) == 'M') {
                        return 900 + MyRoman.convert(romanNumeral.substring(2));
                    }
                }
                return 100 + MyRoman.convert(romanNumeral.substring(1));
            case 'V':
            case 'L':
            case 'D':
            case 'M':
                return map.get(romanNumeral.charAt(0)) + MyRoman.convert(romanNumeral.substring(1));
            default: return -1;
        }
    }

    public static void main(String[] args) {
    }
}
