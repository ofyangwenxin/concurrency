package net.yangwenxin.concurrency.example.singleton;

import net.yangwenxin.concurrency.annotation.NotThreadSafe;

/**
 * 懒汉模式
 * 单例模式在第一次使用进行创建
 */
@NotThreadSafe
public class SingletonExample1 {

    // 私有构造函数
    private SingletonExample1() {
    }

    // 单例对象
    private static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
