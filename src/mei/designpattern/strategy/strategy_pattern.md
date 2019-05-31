### Strategy pattern 

策略多选一, 代替继承

#### 1.定义
Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary 
independently from clients that use it.

#### 2.结构
* Context(环境类): 解决问题，引用某个策略类
* Strategy(抽象策略类): 抽象类或者接口，声明具体策略类需要实现的具体方法
* ConcreteStrategy(具体策略类): 实现具体方法

故事主线：Context类中包含一个Strategy类，并且在某个方法中调用ConcreteStrategy中的某方法。

#### 3.实现

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/strategypatternstructure.png)

#### 4.应用

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/movieticket.png)

#### 5.优点

* 管理相关算法族(一堆算法类)
* 替换继承关系，去除context类的子类
* 避免多重条件选择
* 算法复用机制

#### 6.缺点

* client必须知道所有的strategy并进行选择
* 产生很多的strategy
* 无法同时使用很多strategy

#### 7.适用环境

* 动态多选一
* 需要去除if-else
* 不希望client知道具体的strategy实现

#### 8.问题
