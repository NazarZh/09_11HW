package com.company;

public class StackOverFlowTest {

    static int count;


    public static void test(){
        count++;
        System.out.println(count);
        test();
    }

    public static void main(String[] args) {

        try {
            test();
        } catch (StackOverflowError e) {
            System.out.println("Too much, too much");
        }
    }
}
