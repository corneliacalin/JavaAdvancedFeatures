package oop.patterns.singleton;

public class Sun {
    private static Sun instance;

    //   private static Sun instance=new Sun();
    private Sun() {
        System.out.println("s-a apelat constructorul sun");

    }

    public static synchronized Sun getInstance() {

        if (instance == null) {
                      synchronized (Sun.class){
            if (instance == null) {
                instance = new Sun();
            }
        }
    }
        return instance;
    }
}
