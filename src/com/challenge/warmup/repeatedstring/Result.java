package com.challenge.warmup.repeatedstring;

public class Result {

    public static long repeatedString(String s, long n) {

        var qtdCharString = s.chars().filter(ch -> ch == 'a').count();
        var multiply = n / s.length();
        var restChar = n % s.length();

        var qtdChar = qtdCharString * multiply;

        if (restChar != 0)
            qtdChar += s.substring(0, (int)restChar).chars().filter(ch -> ch == 'a').count();

        return qtdChar;
    }
}
