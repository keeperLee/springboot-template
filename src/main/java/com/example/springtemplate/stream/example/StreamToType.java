package com.example.springtemplate.stream.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author CarryBoy
 * @Description 流转化为常用数据结构
 */
public class StreamToType {
    public static void main(String[] args) {
        //创建stream,将stream转化为数组
        Stream stream = Stream.of("a", "b", "c");
        Object[] objectArray = stream.toArray(String[]::new);
        System.out.println(objectArray);

        //创建stream,转换为string
        Stream stream1 = Stream.of("a","b","c");
        String str1 = stream1.collect(Collectors.joining()).toString();
        System.out.println(str1);

        //创建stream,转化为list
        Stream stream2 = Stream.of("a","b","c");
        List<String>  strList = (List<String>) stream2.collect(Collectors.toList());
        System.out.println(strList);

        //创建stream,转化为set
        Stream stream3 = Stream.of("a","b","c");
        Set<String> strSet = (Set<String>)stream3.collect(Collectors.toSet());
        System.out.println(strSet);

    }
}
