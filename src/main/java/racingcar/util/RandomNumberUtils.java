package racingcar.util;

import java.util.Random;

public class RandomNumberUtils {

    private static final int RANDOM_NUMBER_BOUNDARY = 10;

    private RandomNumberUtils() {
    }

    public static int generateNumber() {
        return new Random().nextInt(RANDOM_NUMBER_BOUNDARY);
    }
}
