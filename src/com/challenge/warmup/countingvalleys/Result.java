package com.challenge.warmup.countingvalleys;

public class Result {

    public static int countingValleys(int steps, String path) {
        int counter = 0;
        int valleyCounter = 0;
        var direction = path.split("");

        for (String move : direction) {
            counter = move.equals("U") ? counter + 1 : counter - 1;

            if (move.equals("U") && counter == 0)
                valleyCounter++;
        }

        return (counter == 0) ? valleyCounter : 0;
    }
}
