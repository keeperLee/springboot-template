package com.example.springtemplate.stream.example;

import io.swagger.models.auth.In;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author CarryBoy
 * @Description 常用数据结构转化成流
 */
public class TypeToStream {
    public static void main(String[] args) {
        //多个数据直接转化为stream
        Stream stream1 = Stream.of("a","b","c");

        //数组转化为stream
        String[] strArray = new String[]{"a","b","c"};
        Stream stream2 = Arrays.stream(strArray);

        //列表转化为stream
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        Stream stream3 = strList.stream();

        //Set转化为stream
        Set<String> strSet = new HashSet<>();
        strSet.add("a");
        strSet.add("b");
        Stream stream4 = strSet.stream();

        //Map转化为stream
        Map<String, Integer> map = new HashMap<>();
        map.put("a",100);
        map.put("b",200);
        Stream stream5 = map.entrySet().stream();

    }
}
