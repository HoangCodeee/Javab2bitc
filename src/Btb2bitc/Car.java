package Btb2bitc;

public class Car {
    private int speed;
    public Car() {
        this.speed = 0;
    }
    public int upTo20() {
        speed += 20;
        return speed;
    }
    public int upTo40() {
        speed += 40;
        return speed;
    }
    public int upTo60() {
        speed += 60;
        return speed;
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        int upTo1 = car1.upTo20();
        System.out.printf("Vehicle speed in the first increase : %d km/h %n",upTo1);
        int upTo2 = car1.upTo40();
        System.out.printf("Vehicle speed in the second increase : %d km/h %n",upTo2);
        int upTo3 = car1.upTo60();
        System.out.printf("Vehicle speed in the third increase : %d km/h %n",upTo3);
        int upTo4 = car1.upTo20();
        System.out.printf("Vehicle speed in the fourth increase : %d km/h %n",upTo4);

    }
}
