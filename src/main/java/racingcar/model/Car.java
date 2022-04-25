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
            throw new UserInputException(Message.ERROR_NAME_LEN_OVER);

        if("".equals(this.name))
            throw new UserInputException(Message.ERROR_NAME_USE_NOT_SPACE);
    }

    public String getName(){
        return name;
    }
}
