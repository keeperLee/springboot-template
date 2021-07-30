package com.example.springtemplate.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author CarryBoy
 * @date 2021/7/30 11:11
 * @description MapToInt用法
 */
public class MaptoIntStream {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        int max = stream.mapToInt(x->x).summaryStatistics().getMax();
        System.out.println(max);
    }

}
