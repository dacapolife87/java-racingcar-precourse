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

    public void race(MovingStandard movingStandard) {
        if(movingStandard.isMoveJudge()) {
            position++;
        }
    }
}
