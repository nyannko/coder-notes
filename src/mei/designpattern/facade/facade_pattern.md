### Facade pattern 
引入外观类，简化客户端和子系统之间的交互/耦合

#### 1.定义
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes
 the subsystem easier to use.
 
#### 2.结构
* Facade(外观): 处理客户端的请求，整合子系统功能
* SubSystem(子系统): 实现一个功能的单独的类或者类的集合

#### 3.实现
分为普通和抽象外观

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/facadestructure.png)

#### 4.应用

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/encryptfacade.png)
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/abstractencryptfacade.png)

#### 5.优点

* 对客户端屏蔽了子系统的组件
* 子系统和客户端的松耦合
* 子系统内部变化不会影响到外观系统

#### 6.缺点

* 不能很好的限制客户端使用子系统，从而减少可变性和灵活性
* 设计不当，修改了外观类源码，违背开闭原则

#### 7.适用环境

* 为访问复杂子系统提供一个简单入口
* 客户端和多个子系统之间存在很大的依赖性
* 层次化结构中使用外观模式定义系统中每一层的入口

![](http://ww4.sinaimg.cn/large/006tNc79gy1g3j037z0ktj308c08cmxf.jpg)