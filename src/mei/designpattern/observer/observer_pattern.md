### Observer pattern

两个互相关联的类的通知，更新操作

#### 1.定义

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are 
notified and updated automatically.

#### 2.结构
* Subject(目标): 被观察的对象，支持增删改查
* ConcreteSubject(具体目标): 实现notify方法
* Observer(观察者): 声明了update状态方法的接口
* ConcreteObserver(具体观察者): 储存了目标状态并实现update的具体方法

故事主线：Observer发现Subject中的状态发生变化之后，调用Subject中的notify方法(observers.update())

#### 3.实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/observerstructure.png)

#### 4.应用
JDK.observable, GUI, MVC

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/allycontrolcenter.png)
#### 5.优点

* 表示层和数据逻辑层的分离（？）
* Subject和Observer松耦合（这也叫优点
* 支持广播
* 符合开闭原则 

#### 6.缺点

* 循环引用
* 很多观察者会花时间
* Observer仅仅知道Subject发生了变化，但并不知道怎么变化

#### 7.适用环境

* 一个抽象模型的两方面互相依赖
* 一对多，且一个对象发生变化引起另一个对象发生变化
* 触发机制

..这三条是在讲一个方面8

#### 8.问题

有点像twisted里面实现一个IRC channel