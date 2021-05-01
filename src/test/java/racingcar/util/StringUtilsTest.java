package racingcar.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource(value = {"JHJ,hJJANG,Jang:3"}, delimiter = ':')
    void seperatorTest(String inputNames) {

        String[] names = StringUtils.separator(inputNames);

        assertThat(names.length).isEqualTo(3);
    }

}
