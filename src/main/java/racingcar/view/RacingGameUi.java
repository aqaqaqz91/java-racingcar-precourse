package racingcar.view;

import racingcar.model.Message;

public class RacingGameUi {
    public static void printNameInputMsg(){
        System.out.print(Message.CAR_NAME_INPUT + ":");
    }

    public static void printLapsInputMsg(){
        System.out.print(Message.RACING_LAPS_INPUT + ":");
    }
}
