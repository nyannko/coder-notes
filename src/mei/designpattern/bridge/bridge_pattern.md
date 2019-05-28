### Bridge pattern

桥接模式是一种很实用的结构设计型模式，如果系统中的某个类存在两个独立变化的维度，通过桥接模式可以将这两个维度分离出来，使两者独立扩展

#### 定义

Decouple an abstraction from its implementation so that two can vary independently.

#### 结构

* Abstraction: 定义抽象类，其中包含了Implementor(与本类有关联)

* RefinedAbstraction: 扩展Abstraction定义的接口

* Implementor: 定义实现类的接口

* ConcreteImplementor: 具体实现了Implementor的接口


#### 实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/bridgestructure.png)
#### 应用
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/imageviewer.png)

#### 优点
* 分离抽象接口和

* 减少子类个数，比多层继承方案更好

* 提高系统可扩展性

#### 缺点
* 增加系统理解难度

* 要求正确识别出两个系统的维度

#### 适用环境

* 避免在两个层次间建立静态的继承关系

* 抽象部分和实现部分可以用继承的方式独立扩展，互不影响

* 一个类存在两个（或多个）独立变化的维度

* 不希望使用多层继承导致类个数增加

#### 问题
不用桥接模式怎么写？

为什么一个是抽象类一个是接口？

两个维度以上的桥接模式怎么写？