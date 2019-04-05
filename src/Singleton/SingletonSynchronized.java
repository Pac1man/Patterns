package Singleton;

public class SingletonSynchronized {
        private volatile static SingletonSynchronized uniqueInstance;

        private SingletonSynchronized(){}

        public static synchronized SingletonSynchronized getInstance() {
            synchronized (SingletonSynchronized.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSynchronized();
                }
                return uniqueInstance;
            }
        }
    }
