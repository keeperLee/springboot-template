package com.example.springtemplate.stream.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CarryBoy
 * @date 2021/7/30 10:32
 * @description limit用法
 */
public class LimitStream {
    public static void main(String[] args) {
        //创建list集合
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        //进行distinct操作
        strList.stream().limit(1).forEach(System.out::println);
    }
}
