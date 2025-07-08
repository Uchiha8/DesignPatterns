package creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        System.out.println("Instance created by " + Thread.currentThread().getName());
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
