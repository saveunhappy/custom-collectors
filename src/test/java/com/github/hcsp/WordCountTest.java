package com.github.hcsp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
    public void test() {
        Map<String, Integer> actual =
                WordCount.count(Arrays.asList("a", "b", "c", "a", "b", "c", "d", "a"));
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("b", 2);
        expected.put("c", 2);
        expected.put("d", 1);

        Assertions.assertEquals(expected, actual);
    }
}
