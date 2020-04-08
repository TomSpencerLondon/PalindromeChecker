package com.codurance.is_palindrome;

public class Palindrome {
    public boolean check(String phrase) {
        char[] a = phrase.toCharArray();
        int aLength = a.length;
        char[] b = new char[aLength];

        int j = a.length;

        for(int i = 0; i < aLength; i++){
            b[j - 1] = a[i];
            j -= 1;
        }

        String string1 = new String(a);
        String string2 = new String(b);

        if(string1.equals(string2)){
            return true;
        }

        return false;
    }
}
