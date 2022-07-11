package com.ll.exam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString("수정?id=10?하하".split("\\?",2)));
        new App().run();
    }
}
