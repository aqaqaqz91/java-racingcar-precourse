package racingcar.model;

import racingcar.exception.UserInputException;

public class Car {
    private String name;

    public Car(String name){
        this.name = name.trim();
        checkNameValidation();
    }

    private void checkNameValidation(){
        if(this.name.length() > Rule.CAR_NAME_MAX_LEN)
            throw new UserInputException("자동차 이름길이 오류");

        if("".equals(this.name))
            throw new UserInputException("자동차 이름은 공백이 불가능합니다");
    }

    public String getName(){
        return name;
    }
}
