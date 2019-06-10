### Prototype pattern

复制

#### 1.定义
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

#### 2.结构
* Prototype: 是声明clone方法的接口或抽象类
* ConcretePrototype: 实现在Prototype中声明的clone方法
* Client: 调用clone方法获取多个对象

#### 3.实现

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/prototypestructure.png)


#### 4.应用
* shallow clone: impl Cloneable

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/weeklylog.png)


* deep clone: impl Serializable

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/weeklylogdeepclone.png)

* Prototype Manager

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/prototypemanager.png)


#### 5.优点

* 当创建新对象实例复杂时（？）使用原型模式会提高效率
* 扩展性较好
* 原型模式提供了简化的创建结构
* 可以使用deepclone的方式保存对象的状态

#### 6.缺点

* 需要为每一个类提供一个clone方法
* 类嵌套引用时，每一层都必须实现deep clone，较为麻烦

#### 7.适用环境

* 创建新对象成本较大
* 系统要保存对象的状态，而对象的状态变化很小
* 需要避免使用分层次的工厂类来创建分层次对象

#### 8.问题
