package com.example.springtemplate.stream.example;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author CarryBoy
 * @date 2021/7/30 11:17
 * @description
 */
public class FindFirstStream {
    public static void main(String[] args) {
        // 获取 Stream 对象
        Stream<Integer> stream = Stream.of(1, 3, 5, 8, 10, 13, 15);
        // 通过 filter 过滤，然后获取其中第一个元素
        Optional<Integer> first = stream.filter(x -> x > 3).findFirst();
        // 输出
        if (first.isPresent()){
            System.out.println(first.get());
        }
    }
}
