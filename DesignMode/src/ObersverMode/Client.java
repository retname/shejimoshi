package ObersverMode;

/**
 * Created by zhangyu on 2018/3/10.
 * 客户端类
 */
public class Client {


    public static void main(String[] args) {

        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();


        //创建观察者对象
        Observer observer = new ConcreteObserver();


        //将观察者对象登记到主题对象上
        subject.attach(observer);



        //改变主题对象的状态
        subject.change("你已被裁决");


        subject.detach(observer);



    }
}
