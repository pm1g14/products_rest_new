package com.algomi.interview;

public class StringUtils {
    public static String rightPad(String value, char padding, int length){
        int pads = length - value.length();
        return pads <= 0
                ? value
                : value.concat(padding(pads, padding));
    }

    private static String padding(int length, char padding) {
        String result = "";
        while(result.length() < length){
            result += padding;
        }
        return result;
    }
}
