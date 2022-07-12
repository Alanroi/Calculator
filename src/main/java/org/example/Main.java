package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("the calculator is ready");
        System.out.println(add(1,6));
        System.out.println(mul(1,6));
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }

    public static BigInteger sub(int a,int b){
        return BigInteger.valueOf(a).subtract(BigInteger.valueOf(b));
    }
    public static int div(int a,int b){
        return a/b;
    }
}