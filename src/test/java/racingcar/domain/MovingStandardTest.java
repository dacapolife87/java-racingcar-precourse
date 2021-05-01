package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MovingStandardTest {

    @Test
    void moveTest() {
        MovingStandard movingStandard = MovingStandard.judge(4);

        assertThat(movingStandard).isEqualTo(MovingStandard.MOVE);
        assertTrue(movingStandard.isMoveJudge());
    }

    @Test
    void stopTest() {
        MovingStandard movingStandard = MovingStandard.judge(3);

        assertThat(movingStandard).isEqualTo(MovingStandard.STOP);
        assertFalse(movingStandard.isMoveJudge());
    }
}
