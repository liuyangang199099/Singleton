/**
 * Created by yangangl on 2016/8/24.
 * 饿汉式单例类
 */
public class EagerSingletonA {
    /**
     * 通过静态变量初始化的类实例
     */
    private static final EagerSingletonA instance = new EagerSingletonA();

    /**
     * 私有的默认构造子
     */
    private EagerSingletonA() {
    }

    /**
     * 获取唯一类实例的静态工厂方法
     *
     * @return
     */
    public static EagerSingletonA getInstance() {
        return instance;
    }
}
