package com.example.springtemplate.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author CarryBoy
 * @date 2021/7/30 10:48
 * @description map操作
 */
public class MapStream {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        List<String> resultList = strList.stream().map(x->"测试："+x).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }

}
