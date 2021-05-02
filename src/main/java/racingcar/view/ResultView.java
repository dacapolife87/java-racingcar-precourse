package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.util.StringUtils;

import java.util.List;
import java.util.StringJoiner;

public class ResultView {

    private static final String CAR_MOVING_PATH = "-";
    private static final String CAR_DELIMITER_NAME_AND_PATH = " : ";
    private static final String CAR_DELIMITER_NAMES = ", ";
    private static final String MESSAGE_WINNERS_INTRODUCE = "우승자는 %s 입니다.";

    public void showRoundResult(List<Car> cars) {
        for (Car car : cars) {
            showCarRoundResult(car);
        }
    }

    private void showCarRoundResult(Car car) {
        StringJoiner joiner = new StringJoiner(CAR_DELIMITER_NAME_AND_PATH);
        joiner.add(getCarName(car.getName()));
        joiner.add(getCarProgress(car.getPosition()));
        System.out.println(joiner.toString());
    }

    private String getCarName(CarName carName) {
        return StringUtils.fixedLengthString(carName.getName());
    }

    private String getCarProgress(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(CAR_MOVING_PATH);
        }
        return sb.toString();
    }

    public void showWinners(List<Car> cars) {
        StringJoiner joiner = new StringJoiner(CAR_DELIMITER_NAMES);
        for (Car car : cars) {
            joiner.add(getWinnersName(car.getName()));
        }

        String winnerMessage = makeWinnerMessage(joiner.toString());
        System.out.println(winnerMessage);
    }

    private String makeWinnerMessage(String winners) {
        return String.format(MESSAGE_WINNERS_INTRODUCE, winners);
    }

    private String getWinnersName(CarName carName) {
        return carName.getName();
    }
}
