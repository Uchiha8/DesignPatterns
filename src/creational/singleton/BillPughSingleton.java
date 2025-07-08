package creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("Singleton constructor called by " + Thread.currentThread().getName());
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
