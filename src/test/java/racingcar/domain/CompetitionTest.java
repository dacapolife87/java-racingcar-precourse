package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CompetitionTest {

    private Cars cars;
    private Round round;

    @BeforeEach
    void initObject() {
        Car car = Car.create(CarName.create("AVANT"), Position.create(0));
        List<Car> carList = new ArrayList<>(Arrays.asList(car));

        this.cars = Cars.create(carList);
        this.round = new Round(5);
    }

    @DisplayName("대회 기본정보 객체 생성 테스트")
    @Test
    void createCompetitionTest() {
        Competition competition = new Competition(cars, round);

        assertThat(competition.getCars()).isEqualTo(cars);
        assertThat(competition.getCountOfRound()).isEqualTo(round.getRound());
    }


}
