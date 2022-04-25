package racingcar.model;

import racingcar.exception.UserInputException;

import java.util.ArrayList;
import java.util.List;

public class RacingInfo {
    private List<Car> carList = new ArrayList();
    private int loopCnt = 0;


    public void setCarList(String nameList){
        for(String name : nameList.split(Rule.SPLIT))
            carList.add(new Car(name));
    }

    public void setLoopCnt(String cnt){
        try{
            loopCnt = Integer.parseInt(cnt);
        }catch(NumberFormatException e){
            throw new UserInputException(Message.ERROR_LOOP_CNT_DIGIT);
        }

        if(loopCnt <= 0)
            throw new UserInputException(Message.ERROR_LOOP_CNT_NOT_NEGATIVE);
    }
}
