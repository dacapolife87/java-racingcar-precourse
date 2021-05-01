package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    String carName = "test";
    Car car;

    @BeforeEach
    private void createCar() {
        CarName name = CarName.create(carName);
        car = Car.create(name);
    }

    @Test
    void createCarTest() {
        CarName name = CarName.create(carName);

        assertThat(car.getName()).isEqualTo(name);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void moveCarTest() {
        car.race(MovingStandard.MOVE);
        assertThat(car.getPosition()).isEqualTo(1);
    }


    @Test
    void stopCarTest() {
        car.race(MovingStandard.STOP);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
