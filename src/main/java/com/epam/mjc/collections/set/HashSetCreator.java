package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();

        for (int num : sourceList) {
            if (num % 2 == 0) {
                res.add(num);
                while (num % 2 == 0) {
                    num = num / 2;
                    res.add(num);

                }
            } else {
                res.add(num);
                res.add(num * 2);
            }
        }
        return res;
    }
}
