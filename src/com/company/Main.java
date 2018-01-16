package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int answer1 = a + b;
        System.out.println("Answer " + answer1);
        int answer2 = c + d;
        System.out.println("Answer " + answer2);

        sayHello("Manny");
        sayHello("Lori");
        sayHello("Ted");


//        //System.out.println("Answers: " + answer1 + " " + answer2);
//        addTwoNumbersAndPrint(22, 1);
//        addTwoNumbersAndPrint(100, 1002);

        int newValue = addTwoNumbersAndDivideByTwo(10, 30);
        System.out.println("Here is the new value : " + newValue);
    }

    public static int addTwoNumbersAndDivideByTwo(int value3, int value4) {
        int newSum = value3 + value4;
        int divTwo = newSum / 2;
        return divTwo;
    }

    public static void addTwoNumbersAndPrint(int value1, int value2){
        int sum = value1 + value2;
        System.out.println("The sum is: " + sum);

    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }
}

