package models;

public class Bike extends Vechicle{
    int Rate = 15;
    String Model;

    public Bike(int rate, String model) {
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