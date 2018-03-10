package FactoryMode;

/**
 * Created by zhangyu on 2018/3/10.
 * 创建具体的工厂FactoryB320  来生产具体的产品Bwm320
 *
 */
public class FactoryBwm320 implements Factory {



    @Override
    public Bwm createBwm() {
        return new Bwm320();
    }
}
