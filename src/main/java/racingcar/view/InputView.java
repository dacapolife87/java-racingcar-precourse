package racingcar.view;


import java.util.Scanner;

public class InputView {

    private static final String QUESTION_PLAYERS_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String QUESTION_COUNT_OF_ROUND = "시도할 회수는 몇회인가요?";

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
