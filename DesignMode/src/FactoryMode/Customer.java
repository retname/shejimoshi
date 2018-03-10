package FactoryMode;

/**
 * 创建客户类
 * Created by zhangyu on 2018/3/10.
 */
public class Customer {

    public static void main(String[] args) {

        FactoryBwm320 factoryBwm320  = new FactoryBwm320();
        factoryBwm320.createBwm();


        FactoryBwm523 factoryBwm523 = new FactoryBwm523();
        factoryBwm523.createBwm();

    }


}
