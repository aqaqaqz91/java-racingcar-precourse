package racingcar.view;

import racingcar.model.Message;

public class RacingGameUi {
    public static void printNameInputMsg(){
        System.out.print(Message.CAR_NAME_INPUT + ":");
    }

    public static void printLoopCntInputMsg(){
        System.out.print(Message.RACING_LOOP_CNT + ":");
    }
}
