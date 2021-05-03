package racingcar.domain;

public class Round {

    private static final int MINIMUM_ROUND = 1;
    private static final String EXCEPTION_MESSAGE_INVALID_ROUND_NUMBER = "라운드값은 최소 1 이상이여야합니다.";

    private int countOfRound;

    public Round(int countOfRound) {
        this.countOfRound = countOfRound;

        if (countOfRound < MINIMUM_ROUND) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_ROUND_NUMBER);
        }
    }

    public int getRound() {
        return countOfRound;
    }
}
