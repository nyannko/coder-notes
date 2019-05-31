### Adapter pattern

转化不兼容的两个接口，使其协同工作

#### 1.定义
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that 
couldn't otherwise  because of incompatible interfaces.

#### 2.结构

* Target(目标抽象类): 定义client所需要的接口
* Adapter(适配器类): 作为target和adaptee中间的类
* Adaptee(适配者类): 已经存在的方法类, client希望调用这些方法


#### 3.实现

* class adapter和object adapter的区别: 前者继承adaptee, 后者在adapter中注入/设置adaptee, 为关联关系
* object adapter使用频率高，因为Java中继承只能继承一个父类

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/classadaptor.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/objectadaptor.png)


#### 4.应用
* Target: CarController
* Adapter: PoliceCarAdapter
* Adaptee: PoliceSound, PoliceLight

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/carcontroller.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/carcontroller1.png)


#### 5.优点

* 通过引入adapter使得target和adaptee解耦，无需修改源代码
* 增加了类的透明/复用
* 灵活性/扩展性，容易通过配置文件修改接口
* object adapter可以将不同adapter配置到同一个target，如本例

#### 6.缺点

* adapter在java中不能为final

...

#### 7.适用环境

* 系统需要使用一些现有的类，而这些类中的方法不符合系统的需要
* 可以被重复使用到的类

#### 8.问题

* Default adapter pattern
* Two-way adapter pattern