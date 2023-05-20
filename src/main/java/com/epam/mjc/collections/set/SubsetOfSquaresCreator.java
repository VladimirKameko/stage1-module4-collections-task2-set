package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> res = new HashSet<>();

        for (int num : sourceList) {
            num = num * num;
            if (num >= lowerBound && num <= upperBound){
                res.add(num);
            }
        }
        return res;
    }
}
