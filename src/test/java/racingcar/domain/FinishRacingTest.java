package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FinishRacingTest {

    @BeforeEach
    void initCars() {

    }

    @DisplayName("참여 Cars중에서 우승자를 판단하는 기능 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:3:3:2", "1:2:3:1", "1:1:3:1", "2:2:2:3"}, delimiter = ':')
    void judgeWinnerTest(int position1, int position2, int position3, int countOfWinner) {
        Cars cars = makeCars(position1, position2, position3);

        FinishRacing finishRacing = new FinishRacing(cars);

        Cars judgeResult = finishRacing.judgeResult();

        assertThat(judgeResult.listOfCars().size()).isEqualTo(countOfWinner);
    }

    private Cars makeCars(int position1, int position2, int position3) {
        Car car1 = makeCar("TEST1", position1);
        Car car2 = makeCar("TEST2", position2);
        Car car3 = makeCar("TEST3", position3);
        List<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3));
        return Cars.create(carList);
    }

    private Car makeCar(String name, int position) {
        Car car = Car.create(CarName.create(name), Position.create(position));
        return car;
    }
}
