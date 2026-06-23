package tech.codingclub;

public class ElectricCar extends Car {
    private double batteryLeft = 100;
    public ElectricCar(){

    }
    public ElectricCar(String numberPlate){
        //please call constructor of my parent class
        super(numberPlate);
    }
    public ElectricCar(String numberPlate,int currentSpeed){
        //please call constructor of my parent class
        super(numberPlate,currentSpeed);
    }
    public double batteryPercentageLeft(){
        return batteryLeft;
    }
    public void accelerate(){
        //polymorphism
        super.accelerate();
        batteryLeft -= 0.5;
    }
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("TESLA 001",500);
        tesla.accelerate();
        ElectricCar.printAboutWheel();
        System.out.println("TESLA SPEED :"+tesla.getCurrentSpeed()+" BATTERY: "+tesla.batteryLeft);
    }
}
