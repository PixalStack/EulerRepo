package com.teamTNT;

// auther Muzammil Ansari
public class Main {

    /*
    Q.1 https://projecteuler.net/problem=1
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
    */

    public static void main(String[] args) {
        final int numberListLength = 1000;
        final int[] multipleOfList = {3,5};

        int Total = 0;
        int[] naturalNumber = makeArray(numberListLength);

        for (int num:multipleOfList){
            int[] multipleOfNumberList = getMultipleOfNumberList(naturalNumber,num);
            Total += addAll(multipleOfNumberList);
        }

        System.out.println(Total);

    }

    private static int[] makeArray(int x) {
        int[] naturalNumber = new int[x];
        for(int i = 0; i < x;i++){
            naturalNumber[i] = i;
        }
        return naturalNumber;
    }

    private static int addAll(int[] multipleOfNumberList) {
        int sumOfNatNumMul = 0;
        for (int num : multipleOfNumberList){
            sumOfNatNumMul += num;
        }
        return sumOfNatNumMul;
    }

    private static int[] getMultipleOfNumberList(int[] naturalNumber,int multipleOf) {
        int[] multipleOfNumber = new int[1000];
        int count = 0;
        for(int num : naturalNumber){
            int newNum = num;

            while(newNum > 0){
                newNum -= multipleOf;
            }

            if(newNum == 0){
                multipleOfNumber[count] = num;
                count++;
            }
        }
        return multipleOfNumber;
    }
}
