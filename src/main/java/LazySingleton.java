/**
 * Created by yangangl on 2016/8/24.
 * 懒汉式单例类
 *
 * 是否还有问题
 */
public class LazySingleton {
    /**
     * 此时静态变量不能声明为final，因为需要在工厂方法中对它进行实例化
     * <p>
     * 别的线程得到的是一个还未初始化的对象，这样会导致系统崩溃。
     * 分配空间,初始化,调用构造方法只会在线程的工作存储区完成,在没有
     * 向主存储区复制赋值时,其它线程绝对不可能见到这个过程
     */
    private static volatile LazySingleton instance;

    /**
     * 私有构造子，确保无法在类外实例化该类
     */
    private LazySingleton() {
    }

    /**
     * synchronized关键字解决多个线程的同步问题
     * 获取类锁
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    //双重检查锁定
    public static LazySingleton getInstanceA() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
