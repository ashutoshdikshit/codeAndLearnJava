package com.adikshit;

public class Main {

    public static void main(String[] args) {

        byte myByteNumber = 111;
        short myShortNumber = 11121;
        int myIntNumber = 007110;
        long myLongNumber = 5000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        short myShortTotal = (short) (5000L + 10L * (myByteNumber + myShortNumber + myIntNumber));
        System.out.println(myLongNumber);
        System.out.println(myShortTotal);

    }
}
