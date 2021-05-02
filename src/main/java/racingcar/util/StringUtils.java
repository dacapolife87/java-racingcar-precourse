package racingcar.util;

public class StringUtils {

    private static final String SEPARATOR_COMMA = ",";
    private static final String FIXED_FIVE_SPACE = "     ";

    private StringUtils() {
    }

    public static String[] separator(String input) {
        return input.split(SEPARATOR_COMMA);
    }

    public static String fixedLengthString(String input) {
        StringBuilder sb = new StringBuilder();

        String newPrefix = FIXED_FIVE_SPACE.substring(input.length());
        sb.append(input).append(newPrefix);

        return sb.toString();
    }
}
