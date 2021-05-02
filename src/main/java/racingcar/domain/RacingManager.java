package racingcar.domain;

import racingcar.util.StringUtils;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingManager {

    private final InputView inputView = new InputView();
    private final ResultView resultView = new ResultView();

    public void playGame() {
        start(readyGame());
    }

    public CompetitionInfo readyGame() {
        Cars cars = initPlayers();
        Round round = initRacingRound();

        CompetitionInfo competitionInfo = new CompetitionInfo(cars, round);

        return competitionInfo;
    }

    private Cars initPlayers() {
        String inputPlayerNames = inputView.inputPlayersName();
        return readyCars(StringUtils.separator(inputPlayerNames));
    }

    private Cars readyCars(String[] playerNames) {
        List<Car> cars = new ArrayList<>();

        for (String playerName : playerNames) {
            CarName carName = CarName.create(playerName);
            cars.add(Car.create(carName, 0));
        }
        return Cars.create(cars);
    }

    private Round initRacingRound() {
        return new Round(inputView.inputCountOfRound());
    }

    public void start(CompetitionInfo competitionInfo) {
        int countOfRound = competitionInfo.getCountOfRound();
        Cars cars = competitionInfo.getCars();
        for (int i = 1; i <= countOfRound; i++) {
            playRound(cars, i);
        }

        finishRacing(cars);
    }

    private void finishRacing(Cars cars) {
        resultView.showWinners(getWinnerCars(cars).listOfCars());
    }

    private Cars getWinnerCars(Cars cars) {
        FinishRacing finishRacing = new FinishRacing(cars);
        return finishRacing.judgeResult();
    }

    private void playRound(Cars cars, int i) {
        System.out.println("[" + i + "] Round ");
        cars.round(new RandomMoveStrategy());
        resultView.showRoundResult(cars.listOfCars());
        System.out.println("===========================================");
    }
}
