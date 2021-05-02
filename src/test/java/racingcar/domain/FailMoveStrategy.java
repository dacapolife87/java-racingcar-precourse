package racingcar.domain;

public class FailMoveStrategy implements MoveStrategy {
    @Override
    public boolean isMove(int value) {
        return false;
    }
}
