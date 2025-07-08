package creational.singleton;

public class Singleton {
    public static void main(String[] args) {
//        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
//        System.out.println(System.identityHashCode(singleton1));
//        System.out.println(System.identityHashCode(singleton2));

//        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
//        System.out.println(System.identityHashCode(singleton1));
//        System.out.println(System.identityHashCode(singleton2));

//        for (int i = 0; i < 10; i++) {
//            Thread t = new Thread(()-> {
//                LazyInitializedSingleton initializedSingleton = LazyInitializedSingleton.getInstance();
//                System.out.println(Thread.currentThread().getName() +
//                        " got instance: " + System.identityHashCode(initializedSingleton));
//            });
//            t.start();
//        }

//        for (int i = 0; i < 10; i++) {
//            Thread t = new Thread(()->{
//                ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
//                System.out.println(Thread.currentThread().getName() +
//                        " got instance: " + System.identityHashCode(singleton));
//            });
//            t.start();
//        }

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(()->{
                BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() +
                        " got instance: " + System.identityHashCode(billPughSingleton));
            });
            thread.start();
        }
    }
}
