package com.challenge.warmup.jumpingontheclouds;

import java.util.Arrays;
import java.util.List;

public class Result {

    public static int jumpingOnClouds(List<Integer> c) {
        int steps = 0;

        for (int i = 0; i < c.size(); i++) {
            if ((i + 2) < c.size() && c.get(i + 2) == 0) {
                steps++;
                i++;
            } else if ((i + 1) < c.size()) {
                steps++;
            }
        }

        return steps;
    }
}
