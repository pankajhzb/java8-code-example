package com.practice;

public class PlayWithString {
    public static void main(String[] args) {
        String str = "pankajbeena";
        reverseString(str);
    }

    // Reverse a String
    private static void reverseString(String str) {
        //char[] chArr = new char[str.length()];
        char[] strArr = str.toCharArray();
        char temp;
        for (int i = str.length()-1; i>= 0; i--) {
            System.out.println(i);
            for(int j=0; j<=i; j++) {
                System.out.println(j);
                temp = strArr[j];
                strArr[j] = strArr[i];
                strArr[i] = temp;
            }
            System.out.println(strArr);
        }
    }
}
