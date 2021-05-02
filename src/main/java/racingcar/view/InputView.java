package racingcar.view;


import java.util.Scanner;

public class InputView {

    private static final String QUESTION_PLAYERS_NAME = "참여자들의 이름을 쉼표(,)로 구분하여 입력하세요";
    private static final String QUESTION_COUNT_OF_ROUND = "이동할 횟수를 입력하세요.";

    public String inputPlayersName() {
        System.out.println(QUESTION_PLAYERS_NAME);
        Scanner scanner = new Scanner(System.in);
        String playersName = scanner.nextLine();

        return playersName;
    }

    public int inputCountOfRound() {
        System.out.println(QUESTION_COUNT_OF_ROUND);

        Scanner scanner = new Scanner(System.in);
        int countOfRound = scanner.nextInt();

        return countOfRound;
    }
}
