package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> res = new HashSet<>();
        thirdSet.stream().filter(a -> !secondSet.contains(a) && !firstSet.contains(a))
                .forEach(res::add);
        for (String str : firstSet) {
            if (secondSet.contains(str) && !thirdSet.contains(str)) {
                res.add(str);
            }
        }
        return res;

    }
}
