### 简单的文件修改小工具

###### 背景

>开发一个小的app，想进行换肤操作（吧图片粘贴过去覆盖下）可是UI给的切图图片名都是在原来的基础上加上了(1),一个一个的鼠标重命名太麻烦了，明显不是码农的风范，这时便想了一个办法写个代码跑下。代码替换下 嘿嘿嘿！！！

 ![image](https://github.com/sunnnydaydev/JavaSEProject/raw/master/src/photo/test.png)
 
###### 转换为需求

> 给定一个文件夹，吧其中图片（png或者jpg图片）的名字的(1)去掉。
> 栗子：hello(1).png -> hello.png

###### 代码设计

>[源码传送门](https://github.com/sunnnydaydev/JavaSEProject/blob/master/src/ModifyFileName.kt)


###### 基本使用
>首先把源文件拷贝到你的工程（工程必须支持kt，没有配置下。一般高版本的idea都支持）

（1）java代码中使用
```java
        // 测试
        ModifyFileName.Companion.modify("C:\\Users\\Avazu Holding\\Desktop\\切图1\\","(1)", "");
```

(2)kotlin 中使用

```java
  // 简单测试
    println(ModifyFileName.modify("C:\\Users\\Avazu Holding\\Desktop\\切图1\\","(1)", ""))
```

###### 说点什么
>周五啦，没事做就打算使用kt练练，，，嘿嘿，其实也就是java文件的操作，这里根据实际需求随便写写。。。。没啥技术含量。。。装逼完毕溜溜球。。。。


