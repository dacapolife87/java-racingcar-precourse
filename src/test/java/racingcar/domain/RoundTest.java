package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RoundTest {

    @DisplayName("Round객체 생성 테스트")
    @Test
    void creatRoundTest() {
        int roundNumber = 5;
        Round round = new Round(roundNumber);

        assertThat(round.getRound()).isEqualTo(roundNumber);
    }

    @DisplayName("Round값이 0이하 일때 예외 테스트")
    @Test
    void minimumRoundValueExceptionTest() {
        assertThatThrownBy(
                () -> new Round(0)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
