package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingInfo {
    List<Car> carList = new ArrayList();

    public void setCarList(String nameList){
        for(String name : nameList.split(Rule.SPLIT))
            carList.add(new Car(name));
    }
}
