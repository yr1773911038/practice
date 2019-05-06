package sjms.demo3;

/**
 * 双检锁
 * 这种方式擦用双锁机制，安全且在多线程情况下能保持高性能
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
