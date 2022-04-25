package racingcar.controller;

import racingcar.exception.UserInputException;
import racingcar.model.RacingInfo;
import racingcar.view.RacingGameUi;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingGameController {
    RacingInfo racingInfo;

    public void start(){
        racingInfo =  new RacingInfo();
        inputCarName();
        inputLoopCnt();
    }

    private void inputCarName(){
        RacingGameUi.printNameInputMsg();

        try{
            racingInfo.setCarList(readLine());
        }catch(UserInputException e){
            inputCarName();
        }
    }

    private void inputLoopCnt(){
        RacingGameUi.printLoopCntInputMsg();

        try{
            racingInfo.setLoopCnt(readLine());
        }catch(UserInputException e){
            inputLoopCnt();
        }
    }
}
