class Vehicle {
    public void vehicle() {
        System.out.println("I am a vehicle");
    }
}

class FourWheeler extends Vehicle {
    public void fourWheeler() {
        System.out.println("I have four wheels");
    }
}

class Car extends FourWheeler {
    public void car() {
        System.out.println("I am a car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.car(); 
        myCar.fourWheeler(); 
        myCar.vehicle();     
    }
}