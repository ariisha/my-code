package com.company;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main (String[] args){
        int ks;
        Scanner num=new Scanner(System.in);
        System.out.print("Input key length in bits:");
        ks=num.nextInt();

        BigInteger k2;
        k2=new BigInteger("2");
        BigInteger result= k2.pow(ks);
        System.out.println("Keyspace:"+result);
                    

    }
}
