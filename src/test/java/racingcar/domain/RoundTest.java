package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoundTest {

    @DisplayName("Round객체 생성 테스트")
    @Test
    void creatRoundTest() {
        int roundNumber = 5;
        Round round = new Round(roundNumber);

        assertThat(round.getRound()).isEqualTo(roundNumber);
    }
}
