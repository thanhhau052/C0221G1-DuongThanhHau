package bai5_access_modifier.thuc_hanh.static_propety;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCar++;
    }



}
