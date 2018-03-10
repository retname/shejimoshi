package ObersverMode;

/**
 * 具体主题角色类  继承抽象主题角色类
 * Created by zhangyu on 2018/3/10.
 * 用来改变观察则的状态
 */
public class ConcreteSubject extends Subject {



    private String state;


    public String getState(){
       return  state;
    }



    public void change(String newState){
        state = newState;
        System.out.println("主题状态为："+state);
        //状态发生改变，通知各个观察者
        this.notifyObserver(newState);
    }

}
