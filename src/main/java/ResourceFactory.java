/**
 * Created by yangangl on 2016/8/24.
 * 不需要额外的同步，但是又能确保对象可见性的正确发布，这是由Java的虚拟机规范所决定的！
 * 专家级别的写法
 */
public class ResourceFactory {

    private ResourceFactory() {
    }

    private static class ResourceHolder {
        public static ResourceFactory resource = new ResourceFactory();
    }

    public static ResourceFactory getResource() {
        return ResourceHolder.resource;
    }
}
