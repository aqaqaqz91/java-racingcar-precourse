package racingcar.model;

import racingcar.exception.UserInputException;
import racingcar.view.RacingGameUi;

import java.util.ArrayList;
import java.util.List;

public class RacingInfo {
    private List<Car> carList = new ArrayList();
    private int laps = 0;

    public List<Car> getCarList() {
        return this.carList;
    }

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

    public void racingStart() {
        RacingGameUi.printRacingResultMsg();
        racing();
    }

    private void racing(){
        this.laps--;

        for(Car c : carList){
            c.move();
            c.printPosition();
        }
        RacingGameUi.printEmptyLine();

        if(laps > 0) racing();
    }
}
