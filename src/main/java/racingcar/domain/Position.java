package racingcar.domain;

public class Position {

    private int position;

    private Position(int position) {
        this.position = position;
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
}
