package com.sdajava.mongo_weekend;

import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldReturnsMapSizeOfThree() {
        String sentence = "mango torun dom dom torun mango";
        Map<String, Integer> map = Main.extrackStringToMap(sentence);
        assertEquals(3, map.size());
    }

    @Test
    public void shouldReturnsMapSizeOfFive() {
        String sentence = "mango torun dom dom torun mango torun2 dom2 dom torun mango";
        Map<String, Integer> map = Main.extrackStringToMap(sentence);
        assertEquals(5, map.size());
    }

    @Test
    public void shouldSortMapInDescendingOrder() {
        Map<String, Integer> map =
                new HashMap<String, Integer>(){{
                    put("jesika", 4);
                    put("dzoanna", 6);
                    put("sebix", 3);
                    put("brajanusz", 2);
        }};
        Map<String, Integer> sortedMap =
                new HashMap<String, Integer>(){{
                    put("sebix", 3);
                    put("jesika", 4);
                    put("dzoanna", 6);
                    put("brajanusz", 2);
        }};

        Map<String, Integer> outputMap = Main.sortMapByKeyDescending(map);
        assertEquals(outputMap, sortedMap);
    }

    @Test
    public void shouldSortMapInAscendingOrder() {
        Map<String, Integer> map =
                new HashMap<String, Integer>(){{
                    put("jesika", 4);
                    put("dzoanna", 6);
                    put("sebix", 3);
                    put("karyna", 1);
                    put("brajanusz", 2);
                }};
        Map<String, Integer> sortedMap =
                new HashMap<String, Integer>(){{
                    put("brajanusz", 2);
                    put("dzoanna", 6);
                    put("jesika", 4);
                    put("karyna", 1);
                    put("sebix", 3);

                }};

        Map<String, Integer> outputMap = Main.sortMapByKeyAscending(map);
        assertEquals(outputMap, sortedMap);
    }
}