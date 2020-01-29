package com.exercises;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello*3 " + letterChanges("hello*3"));
        System.out.println("fun times! " + letterChanges("fun times!"));
    }

    public static String letterChanges(String str){
        int stringLength = str.length();

        String newString = new String();

        for (int i = 0; i < stringLength; i++) {
            char c = str.charAt(i);

            if (Character.isAlphabetic(c)) {

                if (c == 'z' || c == 'Z') {
                    c = 'A';
                } else {
                    c = ++c;
                }

                if (Character.toLowerCase(c) == 'a' ||
                Character.toLowerCase(c) == 'e' ||
                Character.toLowerCase(c) == 'i' ||
                Character.toLowerCase(c) == 'o' ||
                Character.toLowerCase(c) == 'u') {

                    c = Character.toUpperCase(c);
                }
            }

            newString += c;
        }

        return newString;
    }

    public static void isPrimo(int[]array) {

        for (int i : array) {
            double sqrdValue = Math.sqrt(array[i]);
            int roundSqrdValue = (int)Math.round(sqrdValue);

            Boolean isFaggot = true;

            for (int j = 2; j <= roundSqrdValue; j++) {
                if (array[i] % j == 0) {
                    isFaggot = false;
                    break;
                }
            }

            if (isFaggot) {
                System.out.print(array[i] + "is a faggot! :)");
            } else {
                System.out.print(array[i] + "is not a faggot! :)");
            }
        }
    }
}