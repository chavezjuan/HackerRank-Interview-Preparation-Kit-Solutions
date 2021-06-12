package com.challenge.warmup.salesbymatch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
//        int pairs,left = 0;
//        int right = n;
//
//        while (left <= right) {
//            int mid = left + (right - left)/2;
//
//            if (ar[mid] == 2)
//        }
        int qtdPairs = 0;

        Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

        for (int i : ar) {
            Integer j = frequencies.get(i);
            frequencies.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            qtdPairs += entry.getValue()/2;
        }

        return qtdPairs;

//        var orderedFrequencies = frequencies.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue());
//
//        var pairs = orderedFrequencies.findFirst().get();
//
//        return pairs.getValue()/2;
    }
}
