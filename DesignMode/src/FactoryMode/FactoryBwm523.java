package FactoryMode;

/**
 * Created by zhangyu on 2018/3/10.
 */
public class FactoryBwm523 implements Factory {
    @Override
    public Bwm createBwm() {
        return new Bwm523();
    }
}
