package racingcar.domain;

public class Car {

    private CarName name;
    private int position;

    private Car(CarName name, int position) {
        this.name = name;
        this.position = position;
    }

    public static Car create(CarName name, int position) {
        return new Car(name, position);
    }

    public CarName getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void race(int number, MoveStrategy moveStrategy) {
        if (moveStrategy.isMove(number)) {
            position++;
        }
    }

    public boolean isWinnerPosition(int winnerPosition) {
        return winnerPosition == position;
    }
}
