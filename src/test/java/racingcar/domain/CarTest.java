package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    String carName = "test";
    Car car;

    @BeforeEach
    private void createCar() {
        CarName name = CarName.create(carName);
        car = Car.create(name, Position.create(0));
    }

    @DisplayName("차량의 생성 테스트")
    @Test
    void createCarTest() {
        CarName name = CarName.create(carName);

        assertThat(car.getName()).isEqualTo(name);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @DisplayName("차량의 이동 테스트")
    @Test
    void moveCarTest() {
        car.race(4, new RandomMoveStrategy());
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("차량의 정지 테스트")
    @Test
    void stopCarTest() {
        car.race(3, new RandomMoveStrategy());
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
