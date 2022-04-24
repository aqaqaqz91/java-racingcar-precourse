package racingcar.controller;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingGameController {
    public void start(){
        startRacing();
    }

    private void startRacing(){
        List<Car> carList = new ArrayList();
        String carNameList = readLine();
        for(String name : carNameList.split(",")){
            carList.add(new Car(name));
        }

        for(Car c : carList){
            System.out.println(c.getName());
        }
    }
}
