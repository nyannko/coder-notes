### Adaptor pattern

#### 1.定义
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that 
couldn't otherwise  because of incompatible interfaces.

#### 2.结构

* Target(目标抽象类)
* Adaptor(适配器类)
* Adaptee(适配者类)


#### 3.实现

* class adaptor和object adaptor的区别: 前者继承adaptee, 后者在adaptor中注入/设置adaptee, 为关联关系
* object adaptor使用频率高，因为Java中继承只能继承一个父类

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/classadaptor.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/objectadaptor.png)


#### 4.应用
* Target: CarController
* Adapter: PoliceCarAdapter
* Adaptee: PoliceSound, PoliceLight

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/carcontroller.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/carcontroller1.png)


#### 5.优点


#### 6.缺点

#### 7.适用环境

#### 8.问题