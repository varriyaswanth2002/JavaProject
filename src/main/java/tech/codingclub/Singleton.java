package tech.codingclub;

public class Singleton {
    //singleton pattern is a software design pattern that restricts the instantiation of a class to
    //one "singleton" pattern
    public int data;
    //we want same memory to be accessed!
    //a single instance should be created that is a single object
    private static Singleton singleton;//Only one reference! this is at class level not object level
    private Singleton(int data){
        //calling constructor
        // will be called only once when singleton is null
        this.data = data;
        System.out.println("Constructor was called when data was: "+data);
    }


    public static Singleton getSingletonInstance(int data) {
        //return new Singleton();
        //Singleton temp = new Singleton();//creating a new object and taking space in memory
        //how do we avoid to not have multiple copies
        //return temp;
        if(singleton==null) {
            singleton = new Singleton(data);
        }
        return singleton;
    }
}
