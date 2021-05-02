package racingcar.domain;


import java.util.ArrayList;
import java.util.List;

public class FinishRacing {

    private Cars allCars;

    public FinishRacing(Cars cars) {
        this.allCars = cars;
    }

    public Cars judgeResult() {
        List<Car> listOfAllCars = allCars.listOfCars();
        int winnerPosition = getWinnerPosition(listOfAllCars);

        List<Car> winners = new ArrayList<>();
        for (Car car : listOfAllCars) {
            ifWinnerPositionAddCar(winnerPosition, winners, car);
        }

        return Cars.create(winners);
    }

    private void ifWinnerPositionAddCar(int winnerPosition, List<Car> winners, Car car) {
        if (car.isWinnerPosition(winnerPosition)) {
            winners.add(car);
        }
    }

    private int getWinnerPosition(List<Car> listOfCars) {
        int winnerPosition = 0;

        for (Car car : listOfCars) {
            winnerPosition = Math.max(winnerPosition, car.getPosition());
        }

        return winnerPosition;
    }
}
