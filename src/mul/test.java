package mul;


import java.lang.reflect.Method;

/**
 * Created by sunnyDay on 2019/9/20 16:03
 */
public class test {
    public static void main(String[] args) {
        Animal animal = new Fish();

        animal.test();
        animal.run(); // 访问成功，编译期间访问父类方法，发生多态，运行期间调用子类方法。
       // animal.te(); // 只会访问父类的，且访问失败（私有权限）
       //  animal.Bubble(); // 这里输出啥？-> // 调用不了 （对多态理解:编译器调用。即只能调用编译期间的成员，在运行期动态改变）

        try {

            Class clazz = animal.getClass();
            Method method = clazz.getMethod("Bubble", null);
            method.invoke(animal, null);   // 这里输出啥？-> // 反射 运行时 动态调用(相对上面跳过了编译期间的检测)

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
