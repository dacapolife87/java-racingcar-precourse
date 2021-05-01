package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @DisplayName("정상적인 범위내의 이름생성")
    @Test
    void carNameTest() {
        String name = "JHJ";
        CarName carName = CarName.create(name);

        assertThat(carName.getName()).isEqualTo(name);
    }

    @DisplayName("차량 이름의 범위 초과시 에러 테스트")
    @Test
    void carNameExceedSizeExceptionTest() {
        String name = "hjjang";

        assertThatThrownBy(
                () -> CarName.create(name)
        ).isInstanceOf(IllegalArgumentException.class);

    }


}
