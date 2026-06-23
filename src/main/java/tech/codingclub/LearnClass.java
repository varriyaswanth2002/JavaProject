package tech.codingclub;

public class LearnClass {
    public static void main(String[] args) {
        Car audi = new Car("AUDI 007");
        audi.accelerate();
        audi.wheelCount = 8;

        Car bmw = new Car("BMW 2002",100);
        bmw.accelerate();
        bmw.increaseSpeed(1000);
        System.out.println("Current speed Audi: "+audi.getCurrentSpeed());
        System.out.println("Current speed BMW: "+bmw.getCurrentSpeed());
        //the updation of current speed by another object audi doesn't effect our object bmw it just print 0 only
        System.out.println("AW: "+audi.wheelCount);
        System.out.println("BW: "+bmw.wheelCount);//static variables are shared by same memory
        //System.out.println("Car has "+Car.wheelCount+" wheels.");//static can be accessed by class
        // audi.printAboutWheel();
        //bmw.printAboutWheel();
        Car.printAboutWheel();
        Car.wheelCount = 4;
        System.out.println("AW: "+audi.wheelCount);
        System.out.println("BW: "+bmw.wheelCount);
        Car.printAboutWheel();

        DummyCar car1 = new DummyCar() {
            @Override
            public void move() {

            }
        };
    }
}
