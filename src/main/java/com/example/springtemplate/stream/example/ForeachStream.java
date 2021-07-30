package com.example.springtemplate.stream.example;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author CarryBoy
 * @date 2021/7/30 11:24
 * @description foreach
 */
public class ForeachStream {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 使用 forEach 输出
        stream1.forEach(System.out::println);

        System.out.println("---------------------");
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = stream2.collect(Collectors.toList());
        list.forEach(System.out::println);

    }

}
