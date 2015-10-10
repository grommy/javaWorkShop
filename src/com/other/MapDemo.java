package com.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps
 */
public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> cityPostCode = new HashMap<String, Integer>();

        cityPostCode.put("New-York", 34894);
        cityPostCode.put("SF", 90001);
        cityPostCode.put("Denver", 1231);

//        System.out.println(cityPostCode.get("SF"));  // 90001

        cityPostCode.values().forEach(System.out::println);

    }
}
