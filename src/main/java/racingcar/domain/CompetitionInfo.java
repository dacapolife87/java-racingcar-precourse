package racingcar.domain;

public class CompetitionInfo {

    private Cars cars;

    private Round countOfRound;

    public CompetitionInfo(Cars cars, Round countOfRound) {
        this.cars = cars;
        this.countOfRound = countOfRound;
    }

    public int getCountOfRound() {
        return countOfRound.getRound();
    }

    public Cars getCars() {
        return cars;
    }
}
