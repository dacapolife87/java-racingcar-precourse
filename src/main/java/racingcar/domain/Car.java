package racingcar.domain;

public class Car {

    private CarName name;
    private int position;

    private Car(CarName name) {
        this.name = name;
    }

    public static Car create(CarName name) {
        return new Car(name);
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
}
