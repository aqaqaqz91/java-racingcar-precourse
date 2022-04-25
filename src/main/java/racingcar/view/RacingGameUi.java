package racingcar.view;

import racingcar.model.Message;

public class RacingGameUi {
    public static void printEmptyLine() {
        System.out.println();
    }

    public static void printNameInputMsg(){
        System.out.println(Message.CAR_NAME_INPUT);
    }

    public static void printLapsInputMsg(){
        System.out.println(Message.RACING_LAPS_INPUT);
    }

    public static void printRacingResultMsg() {
        System.out.println(Message.RACING_RESULT_MSG);
    }

    public static void printCarNameAndPosition(String name, int pos) {
        System.out.print(name);
        System.out.print(" : ");
        for(int i=0;i<pos;i++){
            System.out.print(Message.CAR_POSITION_CHAR);
        }
        printEmptyLine();
    }
}
