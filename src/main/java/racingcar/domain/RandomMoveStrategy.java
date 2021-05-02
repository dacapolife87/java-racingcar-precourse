package racingcar.domain;

public class RandomMoveStrategy implements MoveStrategy {

    private static final int MOVE_CONDITION = 4;

    @Override
    public boolean isMove(int value) {
        if (value >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }
}
