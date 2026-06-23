package tech.codingclub;

public class Car implements CarInterface{
    public static int wheelCount = 4;
    public static final int maxSpeed = 300; //km/hr// final means we can't change it right now
    private int currentSpeed = 0;//public can be used by all classes
    //private within the same class
    //protected within the same package
    String numberPlate;
    //default constructor
    public Car(){

    }
    public Car(String numberPlate){
        //this means current object reference
        this.numberPlate = numberPlate;
    }
    public Car(String numberPlate,int currentSpeed){
        this.numberPlate = numberPlate;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake() {

    }

    public void accelerate(){
        System.out.println("Speeding up! "+numberPlate);
        currentSpeed+=10;
    }
    //static method can only modify or access static data variable
    //cannot access non static
    public static void printAboutWheel(){
        //currenSpeed++ not valid since not static variable
        //but
        //valid
        System.out.println("Car has "+wheelCount+" wheels.");
    }
    public static void main(String[] args) {


    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed(int i) {
        if(i<0) return;
        currentSpeed+=i;
        if(currentSpeed>=maxSpeed){
            currentSpeed = maxSpeed;
        }
    }

}
