package racingcar.controller;

import racingcar.exception.UserInputException;
import racingcar.model.Car;
import racingcar.model.RacingInfo;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingGameController {
    RacingInfo racingInfo;

    public void start(){
        racingInfo =  new RacingInfo();
        inputCarName();
    }

    private void inputCarName(){
        try{
            racingInfo.setCarList(readLine());
        }catch(UserInputException e){
            System.out.println("[ERROR] "+e.getMessage());
            inputCarName();
        }
    }
}
