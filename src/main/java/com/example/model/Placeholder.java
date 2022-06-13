package com.example.model;

import lombok.Data;

import java.util.List;

/**
 * @author ：yangan
 * @date ：2022/6/2 上午9:15
 * @description：占位符替换内容
 * @version: 1.0
 */
@Data
public class Placeholder {
    private String NAME = "1000.78";
    private String test;
    private String name1 = "10000.78";
    private String name2 = "100000.78";
    private Long name3 = 1000000l;
    private Double name4 = 10000000.78d;
    private Double name5 = 100000000.78;
    private Integer a = 1334;
    private List<String> list;
    private Placeholder2 placeholder2;
}