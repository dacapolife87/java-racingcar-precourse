package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CompetitionInfoTest {

    private Cars cars;
    private Round round;

    @BeforeEach
    void initObject() {
        Car car = Car.create(CarName.create("AVANT"));
        List<Car> carList = new ArrayList<>(Arrays.asList(car));

        this.cars = Cars.create(carList);
        this.round = new Round(5);
    }
    
    @DisplayName("대회 기본정보 객체 생성 테스트")
    @Test
    void createCompetitionInfoTest() {
        CompetitionInfo competitionInfo = new CompetitionInfo(cars, round);

        assertThat(competitionInfo.getCars()).isEqualTo(cars);
        assertThat(competitionInfo.getCountOfRound()).isEqualTo(round.getRound());
    }


}
