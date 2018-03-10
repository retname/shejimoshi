package ObersverMode;

/**
 * 具体观察者角色类
 * Created by zhangyu on 2018/3/10.
 * 更新观察者的状态
 */
public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {

        /**
         * 更新观察者的状态   使其与目标保持一致
         */
        observerState =state;

        System.out.println("状态为："+observerState);

    }
}
