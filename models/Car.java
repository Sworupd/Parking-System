package models;

public class Car extends Vechicle{
    int Rate = 20;
    String Model;

    public Car(int rate, String model) {
        Rate = rate;
        Model = model;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
