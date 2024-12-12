package Car;

public class Car {
    private int speed = 0;
    private int runnedWay = 0;
    public String color = "";
    public String mark = "";

    public void getSpeedInfo() {
        switch (speed) {
            case 0:
                System.out.println("You staying");
                break;
            case 20:
            case 40:
                System.out.println("Low Speed");
                break;
            case 60:
            case 80:
                System.out.println("Normal speed");
                break;
            case 100:
            case 120:
                System.out.println("A little high speed");
                break;
            case 140:
            case 160:
                System.out.println("High speed");
                break;
            case 180:
            case 200:
                System.out.println("VERY HIGH SPEED");
                break;
            default:
                System.out.println(speed);
                break;
        }
    }

    public int increaseSpeed() {
        if (speed == 200) {
            System.out.println("This is maximum speed");
        } else {
            speed += 20;
        }
        return speed;
    }

    public int decreaseSpeed() {
        if (speed == 0) {
            System.out.println("You staying now");
        } else {
            speed -= 20;
        }
        return speed;
    }

    public void setRun(int run) {
        this.runnedWay = run;
    }

    public void getRun() {
        System.out.println(runnedWay);
    }
}