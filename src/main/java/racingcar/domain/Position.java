package racingcar.domain;

public class Position {

    private static final int MINIMUM_POSITION = 0;
    private int position;

    private Position(int position) {
        this.position = position;
        if (position < MINIMUM_POSITION) {
            throw new IllegalArgumentException("위치값은 음수가 될수 없습니다.");
        }
    }

    public static Position create(int position) {
        return new Position(position);
    }

    public int getPosition() {
        return position;
    }

    public void movePosition() {
        position++;
    }

    public boolean samePosition(Position position) {
        return this.position == position.getPosition();
    }
}
