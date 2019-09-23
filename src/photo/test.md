###### 1、给定两个类 

```java
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
--------------------------------------------------------

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
```

###### 尝试回答：

```java
/**
 * Created by sunnyDay on 2019/9/20 16:03
 */
public class test {
    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.test();
        animal.run(); // 这里输出啥？
        animal.te(); // 这里输出啥？
        animal.Bubble(); // 这里输出啥？
        try {
            Class clazz = animal.getClass();
            Method method = clazz.getMethod("Bubble", null);
            method.invoke(animal, null);   // 这里输出啥？

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```