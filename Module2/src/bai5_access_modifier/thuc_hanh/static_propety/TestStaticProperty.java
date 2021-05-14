package bai5_access_modifier.thuc_hanh.static_propety;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Madaz 3","Skyactiv 3");
        Car car2= new Car("Mec ", "Mec 3");
        System.out.println(Car.numberOfCar);
    }
}
