package FactoryMode;

/**
 * 创建工厂类
 * Created by zhangyu on 2018/3/10.
 */
public interface Factory {


    /**
     * 创建指定的产品
     * 这个工厂可以创建很多个不同的产品，但是要创建更多的抽象产品类，并且类下面有不同的具体产品
     * @return
     */
    Bwm createBwm();




}
