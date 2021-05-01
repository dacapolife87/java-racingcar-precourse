package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MovingStandardTest {

    @DisplayName("이동기준의 상태 테스트(이동상태)")
    @Test
    void moveTest() {
        MovingStandard movingStandard = MovingStandard.judge(4);

        assertThat(movingStandard).isEqualTo(MovingStandard.MOVE);
        assertTrue(movingStandard.isMoveJudge());
    }

    @DisplayName("이동기준의 상태 테스트(정지상태)")
    @Test
    void stopTest() {
        MovingStandard movingStandard = MovingStandard.judge(3);

        assertThat(movingStandard).isEqualTo(MovingStandard.STOP);
        assertFalse(movingStandard.isMoveJudge());
    }
}
