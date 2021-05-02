package racingcar.domain;

import racingcar.util.RandomNumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public static Cars create(List<Car> cars) {
        return new Cars(cars);
    }

    public void round(MoveStrategy strategy) {
        for (Car car : cars) {
            car.race(RandomNumberUtils.generateNumber(), strategy);
        }
    }

    public List<Car> listOfCars() {
        return Collections.unmodifiableList(cars);
    }
}
