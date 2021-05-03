package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @DisplayName("쉼표로 구분된 문자열 분리 테스트")
    @ParameterizedTest
    @CsvSource(value = {"JHJ,hJJANG,Jang:3"}, delimiter = ':')
    void seperatorTest(String inputNames, int size) {

        String[] names = StringUtils.separator(inputNames);

        assertThat(names.length).isEqualTo(size);
    }

    @DisplayName("고정된 문자열 길이 변경테스트")
    @ParameterizedTest
    @CsvSource(value = {"JHJ:5", "JANG:5", "HYUNG:5", "JU:5"}, delimiter = ':')
    void fixedLengthNameTest(String name, int length) {
        String fixedLengthName = StringUtils.fixedLengthString(name);
        assertThat(fixedLengthName.length()).isEqualTo(length);
    }


}
