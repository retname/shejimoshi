package ObersverMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类  又称为抽象被观察者角色
 * Created by zhangyu on 2018/3/10.
 */
public abstract class Subject {


    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();


    /**
     * 注册观察者对象
     * @param observer 观察这对象
     */
    public void attach(Observer observer){

        list.add(observer);
        System.out.println("添加一个观察者对象");

    }


    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void detach(Observer observer){


        list.remove(observer);
        System.out.println("移除一个观察者对象");

    }


    /**
     * 通知所有注册的观察者对象
     * @param newState  
     */
    public void notifyObserver(String newState){


        for (Observer item :
                list) {
            item.update(newState);
        }
        
    }


}
