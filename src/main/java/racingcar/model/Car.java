package racingcar.model;

public class Car {
    private String name;

    public Car(String name){
        this.name = name;

        if(!checkNameValidation())
            throw new IllegalArgumentException();
    }

    private boolean checkNameValidation(){
        return true;
    }

    public String getName(){
        return name;
    }
}
