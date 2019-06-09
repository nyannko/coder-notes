### Flyweight pattern
共享系统中相似对象，减少内存使用

#### 1.定义
Use sharing to support large numbers of fine-grained objects efficiently.

#### 2.结构

* Flyweight(抽象享元类):
* ConcreteFlyweight(享元类): 创建的对象称为享元对象，共享intrinsicState
* UnsharedFlyweight(非共享享元类): 不在类中共享状态 (不共享的栗子？)
* FlyweightFactory: 创建享元池并管理享元对象


#### 3.实现

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/flyweightstructure.png)

#### 4.应用

Java中String对象在内存中的共享 (..思考)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/gochess.png)

#### 5.优点

* 减少对象的数量节约内存
* extrinsicState不会影响intrinsicState

#### 6.缺点

* 系统变得复杂
* 读取外部状态使程序运行时间变长

#### 7.适用环境

* 系统中有大量相同或者相似对象
* 大部分状态可以外部化
* 多次重复使用享元对象

#### 8.问题

* 单纯/复合享元模式没看..
* 注意外部状态/内部状态/共享的含义