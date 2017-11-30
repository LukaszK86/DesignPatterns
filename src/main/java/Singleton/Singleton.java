package Singleton;

public class Singleton {

    //access point for any object
    private static Singleton firstInstance = null;//access point for any object

    public String name;

    // to make sure that we have only one instance
    private Singleton() {
        System.out.println("Singleton created");
    }


    //need to be synchronized and also static cause constructor is private (we can't create a object)
    public static Singleton getInstance() {
        if (firstInstance == null) {
            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();
                }
            }
        }
        return firstInstance;
    }
}
