package com.knoldus;

import java.lang.String;

public class StringFunction {
    String rev(String str) {
        if (str.length() == 0)
            return " ";
        return str.charAt(str.length() - 1) + rev(str.substring(0, str.length() - 1));
    }
}
