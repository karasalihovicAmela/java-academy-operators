package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int first = 5;
        int second = 5;
        System.out.println(first + " * " + second + " = " + (first*second));
        System.out.println(first + " / " + second + " = " + (first/second));
        System.out.println(first + " % " + second + " = " + (first%second));
        System.out.println(first + " + " + second + " = " + (first+second));
        System.out.println(first + " - " + second + " = " + (first-second));

        int newVar = 23;
        newVar += 3;
        System.out.println(newVar);

        newVar -= 5;

        System.out.println(newVar);

        newVar /= 5;

        System.out.println(newVar);

        newVar %= 3;

        System.out.println(newVar);

        newVar *= 3;

        System.out.println(newVar);

        int checkValue = 4;

        boolean value = (first < second);
        System.out.println(value);

        if (!(first == second)) {
            System.out.println("Result is true");
        } else {
            System.out.println("Result is false");
        }


        //example
        int firstVar = 4;
        int secondVar = 3;

        System.out.println(firstVar + "+" + secondVar + "=" + (firstVar + secondVar));
        System.out.println(firstVar + "*" + secondVar + "=" + firstVar * secondVar);
        System.out.println(firstVar + "/" + secondVar + "=" + firstVar / secondVar);
        System.out.println(firstVar + "%" + secondVar + "=" + firstVar % secondVar);
        System.out.println(firstVar + "-" + secondVar + "=" + (firstVar - secondVar));

        double secVar= 4.6;
        secVar*=8.2;
        System.out.println(secVar);

        String name = "Naida Bajic Hasic";

        System.out.println("Before using string method = " + name);
        System.out.println("After using string method = " + name.toLowerCase());

        String arrString [] = name.split(" ");

        System.out.println(Arrays.toString(arrString));

    }
}
