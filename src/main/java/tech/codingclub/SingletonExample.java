package tech.codingclub;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingletonInstance(90);
        Singleton obj2 = Singleton.getSingletonInstance(56);//this will get returned with singleton having data =90 already created
        obj1.data = 90;
        obj2.data = 56;
        //we created a single instance so the last updation 56 will be printed both times


        //not a singleton till now
        System.out.println(obj1.data+" & "+obj2.data);
    }

}
