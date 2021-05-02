package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    private Car car;

    @BeforeEach
    void initCar() {
        car = Car.create(CarName.create("AVANT"),0);
    }

    @DisplayName("Cars객체 생성 테스트")
    @Test
    void createCarsTest() {
        List<Car> carList = new ArrayList<>(Arrays.asList(car));
        Cars cars = Cars.create(carList);

        assertThat(cars.listOfCars().size()).isEqualTo(carList.size());
    }

    @DisplayName("차량의 이동 테스트")
    @Test
    void racingCarTest() {
        List<Car> listOfCar = new ArrayList<>(Arrays.asList(car));
        Cars cars = Cars.create(listOfCar);

        for (int i = 0; i < 5; i++) {
            cars.round(new SuccessMoveStrategy());
            assertThat(cars.listOfCars().get(0).getPosition()).isEqualTo(i + 1);
        }
    }

    @DisplayName("차량의 이동 테스트(짝수에 이동, 홀수에 정지)")
    @ParameterizedTest
    @CsvSource(value = {"6:3"}, delimiter = ':')
    void racingCarV2Test(int countOfRound, int lastPosition) {
        List<Car> listOfCar = new ArrayList<>(Arrays.asList(car));
        Cars cars = Cars.create(listOfCar);

        for (int i = 0; i < countOfRound; i++) {
            cars.round(getStrategyEvenGoOddStop(i));
        }

        assertThat(cars.listOfCars().get(0).getPosition()).isEqualTo(lastPosition);
    }

    private MoveStrategy getStrategyEvenGoOddStop(int round) {
        if (round % 2 == 0) {
            return new SuccessMoveStrategy();
        }
        return new FailMoveStrategy();
    }
}
