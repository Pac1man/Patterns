package Singleton;

class Singleton3 {

    public static class SingletonHolder {
        public static final Singleton3 HOLDER_INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}