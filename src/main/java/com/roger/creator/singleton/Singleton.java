package com.roger.creator.singleton;

/**
 * Created by Roger on 2016/11/18.
 */
public class Singleton {

    private static Singleton instance;

    /**
     * 私有构造方法, 防止被实例化
     */
    private Singleton() {
    }

    /**
     * 实现懒加载, 但无法应对多线程环境(可能会返回多个不同的实例)
     * @return
     */
    public static Singleton getInstance1(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 加上同步
     * 问题：只有第一次执行该方法的时候才真正需要同步,一旦设置了instance变量, 就不再需要同步这个方法
     * 同步方法可能造成程序执行效率的下降
     * @return
     */
    public static synchronized Singleton getInstance2(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 急切创建, 不用延迟实例化
     * private static Singleton instance = new Singleton();
     *
     * @return
     */
    public static Singleton getInstance3(){
        return instance;
    }

    /**
     * 双重检查加锁
     * private volatile static Singleton instance;
     * @return
     */
    public static Singleton getInstance4(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
