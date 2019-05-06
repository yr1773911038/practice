package sjms.demo3;

/**
 * 这种方式能达到双检锁方式一样的效果，但是实现更简单。
 * 对静态域使用延迟初始化。
 * Singleton 类被装载了，instance 不一定被初始化。
 * 因为 SingletonHolder 类没有被主动使用，
 * 只有通过显式调用 getInstance 方法时，
 * 才会显式装载 SingletonHolder 类，从而实例化 instance。
 */
public class Singleton5 {
    private static class SingletoHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}

    public static final Singleton5 getInstance(){
        return SingletoHolder.INSTANCE;
    }
}
