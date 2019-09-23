package mul;

/**
 * Created by sunnyDay on 2019/9/23 14:05
 */
public class Fish extends Animal {

    public Fish(){
        System.out.println("我是 fish 无参构造");
    }

    @Override
    public void run() {
        System.out.println("我是鱼，会游泳！！！");
    }

    public void Bubble(){
        System.out.println("吐泡泡！！！");
    }

    public void te(){
        System.out.println("");
    }

}
