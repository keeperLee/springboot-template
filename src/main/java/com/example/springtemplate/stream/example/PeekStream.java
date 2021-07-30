package com.example.springtemplate.stream.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CarryBoy
 * @date 2021/7/30 10:56
 * @description peek操作
 */
public class PeekStream {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("zhangsan");
        strList.add("lisi");
        strList.add("wangwu");
        strList.add("zhaoliu");
        strList.add("sunqi");

        // 执行 peek 操作
        strList.stream().peek(x -> System.out.println("forEach 1：" + x))
                .peek(x -> System.out.println("forEach 2：" + x))
                .forEach(System.out::println);
    }

}
