package com.example.springtemplate.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author CarryBoy
 * @date 2021/7/30 10:36
 * @description sorted用法
 */
public class SortedStream {
    public static void main(String[] args) {
        // 自然排序
        List<String> strList1 = new ArrayList<>();
        strList1.add("a");
        strList1.add("b");
        strList1.add("c");
        strList1.stream().sorted().forEach(System.out::println);

        // 指定规则排序
        List<Integer> strList2 = new ArrayList<>();
        strList2.add(30);
        strList2.add(10);
        strList2.add(20);
        strList2.stream().sorted((x,y) -> x-y).forEach(System.out::println);
    }

}
