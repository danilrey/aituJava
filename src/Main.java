import Car.*;
public class Main {
    public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.getSpeedInfo();
        Toyota.increaseSpeed();
        Toyota.increaseSpeed();
        Toyota.increaseSpeed();
        Toyota.getSpeedInfo();
        Toyota.color = "Blue";
        System.out.println(Toyota.color);
        Toyota.setRun(12500);
        Toyota.getRun();
        Toyota.decreaseSpeed();
        Toyota.getSpeedInfo();
    }
}