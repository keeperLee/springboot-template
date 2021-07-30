package com.example.springtemplate.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author CarryBoy
 * @date 2021/7/30 11:09
 * @description filter的操作
 */
public class filterStream {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("zhangsan");
        strList.add("lisi");
        strList.add("wangwu");
        strList.add("zhaoliu");
        strList.add("sunqi");

        // 执行 filter 操作
        strList = strList.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
        strList.forEach(System.out::println);
    }

}
