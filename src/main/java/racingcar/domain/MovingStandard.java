package racingcar.domain;

public enum MovingStandard {
    MOVE(4, true),
    STOP(3, false);

    private int standard;
    private boolean moveJudge;

    MovingStandard(int standard, boolean moveJudge) {
        this.standard = standard;
        this.moveJudge = moveJudge;
    }

    public static MovingStandard judge(int inputNumber) {
        if (STOP.standard < inputNumber) {
            return MOVE;
        }
        return STOP;
    }

    public boolean isMoveJudge() {
        return moveJudge;
    }

}
