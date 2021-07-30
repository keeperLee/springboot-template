package com.example.springtemplate.stream.example;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author CarryBoy
 * @Description 使用包装类处理基本类型的流
 */
public class WrapStream {

    public static void main(String[] args) {
        //IntStream
        System.out.println("int-stream");
        IntStream.of(new int[]{10,20,30}).forEach(System.out::println);
        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        //LongStream
        System.out.println("long-stream");
        LongStream.of(new long[]{1L,2L,3L}).forEach(System.out::println);
        LongStream.range(1,5).forEach(System.out::println);
        LongStream.rangeClosed(1,5).forEach(System.out::println);

        //DoubleStream
        System.out.println("double-stream");
        DoubleStream.of(1.23,3.21,4.21).forEach(System.out::println);
    }
}
