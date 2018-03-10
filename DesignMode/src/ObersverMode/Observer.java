package ObersverMode;

/**
 * 抽象观察者角色
 * 为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。
 * 提供一个更新接口
 * Created by zhangyu on 2018/3/10.
 */
public interface Observer {


    /**
     * 更新接口
     * @param state  更新时的状态
     */
    public void update(String state);




}
