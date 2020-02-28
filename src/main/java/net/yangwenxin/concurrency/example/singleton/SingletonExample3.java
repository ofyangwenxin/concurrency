package net.yangwenxin.concurrency.example.singleton;

import net.yangwenxin.concurrency.annotation.NotRecommend;
import net.yangwenxin.concurrency.annotation.ThreadSafe;

/**
 * 懒汉模式
 * 单例模式在第一次使用进行创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    // 私有构造函数
    private SingletonExample3() {
    }

    // 单例对象
    private static SingletonExample3 instance = null;

    // 静态的工厂方法
    public static synchronized SingletonExample3 getInstance() {
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return instance;
    }
}
