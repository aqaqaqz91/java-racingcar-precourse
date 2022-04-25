package racingcar.model;

import racingcar.exception.UserInputException;

import java.util.ArrayList;
import java.util.List;

public class RacingInfo {
    private List<Car> carList = new ArrayList();
    private int laps = 0;

    public void setCarList(String nameList){
        for(String name : nameList.split(Rule.SPLIT))
            carList.add(new Car(name));
    }

    public void setLaps(String cnt){
        try{
            laps = Integer.parseInt(cnt);
        }catch(NumberFormatException e){
            throw new UserInputException(Message.ERROR_LAPS_ONLY_DIGIT);
        }

        if(laps <= 0)
            throw new UserInputException(Message.ERROR_LAPS_NOT_NEGATIVE);
    }
}
