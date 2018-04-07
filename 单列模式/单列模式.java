饿汉模式
```java
public class EagerSingleton {
    //饿汉单例模式
    //在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快

    private static EagerSingleton instance = new EagerSingleton();//静态私有成员，已初始化

    private EagerSingleton() {
        //私有构造函数
    }

    public static EagerSingleton getInstance() {
        //静态，不用同步（类加载时已初始化，不会有多线程的问题）
        return instance;
    }
}
```

关键点：
1）私有构造函数


2）静态私有成员--在类加载时已初始化


3）公开访问点getInstance-----不需要同步，因为在类加载时已经初始化完毕，也不需要判断null，直接返回


饿汉式无需关注多线程问题、写法简单明了、能用则用。但是它是加载类时创建实例、所以如果是一个工厂模式、缓存了很多实例、
那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建。
懒汉式的优点是延时加载、缺点是应该用同步、其
实也可以不用同步、看你的需求了，多创建一两个无引用的废对象其实也没什么大不了。


懒汉模式
public class LazySingleton {
    //懒汉式单例模式
    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢

    private static LazySingleton instance = null;//静态私用成员，没有初始化

    private LazySingleton() {
        //私有构造函数
    }

    public static synchronized LazySingleton getInstance() {
        //静态，同步，公开访问点
        
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

关键点：
1）构造函数定义为私有----不能在别的类中来获取该类的对象，只能在类自身中得到自己的对象


2）成员变量为static的，没有初始化----类加载快，但访问类的唯一实例慢，static保证在自身类中获取自身对象


3）公开访问点getInstance： public和synchronized的-----public保证对外公开，同步保证多线程时的正确性（因为类变量不是在加载
时初始化的）


