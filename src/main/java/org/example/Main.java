package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        System.out.println("the calculator is ready");
        System.out.println(add(1,6));
        System.out.println(mul(1,6));
    }

    public static BigInteger add(int a, int b){
        return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
    }
    public static BigInteger mul(int a,int b){
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
    }

    public static int sub(int a,int b){
        return a-b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}