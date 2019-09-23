package photo;

/**
 * Created by sunnyDay on 2019/9/23 14:03
 */
public class Animal {
    public Animal(){
        this("tom");
        System.out.println("我是Animal无参数");
    }
    public Animal(String name){
        System.out.println("我是Animal 1个参数");
    }

    public void test() {
        System.out.println("我是父类中的test方法");
    }

    public void run(){
        System.out.println("我会跑");
    }

    private void te(){
        System.out.println("");
    }
}
