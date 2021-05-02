package racingcar.domain;

public class Car {

    private CarName name;
    private Position position;

    private Car(CarName name, Position position) {
        this.name = name;
        this.position = position;
    }

    public static Car create(CarName name, Position position) {
        return new Car(name, position);
    }

    public CarName getName() {
        return name;
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void race(int number, MoveStrategy moveStrategy) {
        if (moveStrategy.isMove(number)) {
            position.movePosition();
        }
    }

    public boolean isWinnerPosition(int winnerPosition) {
        return winnerPosition == position.getPosition();
    }
}
