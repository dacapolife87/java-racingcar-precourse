package racingcar.domain;

import java.util.Objects;

public class CarName {

    private static final int NAME_LENGTH_MINIMUM_SIZE = 1;
    private static final int NAME_LENGTH_MAXIMUM_SIZE = 5;
    private static final String EXCEPTION_MESSAGE_CAR_NAME_RANGE = "자동차 이름은 1~5글자여야 합니다.";

    private String name;

    private CarName(String name) {
        this.name = name;
        if (name.length() < NAME_LENGTH_MINIMUM_SIZE || name.length() > NAME_LENGTH_MAXIMUM_SIZE) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_CAR_NAME_RANGE);
        }
    }

    public static CarName create(String name) {
        return new CarName(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
