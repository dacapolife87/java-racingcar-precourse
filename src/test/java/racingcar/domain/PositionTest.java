package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PositionTest {

    @DisplayName("Position객체의 생성 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1", "2", "3"})
    void createPositionTest(int positionNumber) {
        Position position = Position.create(positionNumber);
        assertThat(position.getPosition()).isEqualTo(positionNumber);
    }

    @DisplayName("Position객체의 이동 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:2", "2:3", "3:4"}, delimiter = ':')
    void movePositionTest(int positionNumber, int lastPosition) {
        Position position = Position.create(positionNumber);

        position.movePosition();
        assertThat(position.getPosition()).isEqualTo(lastPosition);
    }

    @DisplayName("Position객체의 값이 동일한지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1", "2", "3"})
    void samePositionTest(int positionNumber) {
        Position position = Position.create(positionNumber);

        assertTrue(position.samePosition(Position.create(positionNumber)));
    }

    @DisplayName("Position객체의 값이 동일하지 않은경우 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:2", "2:1", "3:4"}, delimiter = ':')
    void notEqualsPositionTest(int positionNumber, int anotherPosition) {
        Position position = Position.create(positionNumber);

        assertFalse(position.samePosition(Position.create(anotherPosition)));
    }

}
