package com.example.springtemplate.stream.example;

import java.util.stream.LongStream;

/**
 * @author CarryBoy
 * @Description 并行流和串行流的对比
 */
public class ParallalStreamDemo {
    public static void main(String[] args) {
        //并行计算
        long startTime = System.currentTimeMillis();
        long sumReSult1 = LongStream.rangeClosed(1,1000000000L).parallel().sum();
        System.out.println("并行执行耗时:" + (System.currentTimeMillis() - startTime));

        //串行计算
        startTime = System.currentTimeMillis();
        long sumResult2 = LongStream.rangeClosed(1,1000000000L).sum();
        System.out.println("串行执行耗时:" + (System.currentTimeMillis() - startTime));

        System.out.println("Result1:"+sumReSult1);
        System.out.println("Result2:"+sumResult2);
    }
}
