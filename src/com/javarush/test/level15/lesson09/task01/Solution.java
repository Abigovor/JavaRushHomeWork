package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.3d,"one");
        labels.put(1.2d,"two");
        labels.put(1.7d,"three");
        labels.put(1.5d,"four");
        labels.put(1.4d,"five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}