###  Proxy pattern
Client不能直接访问某对象时，使用proxy访问某对象

#### 1.定义
Provide a surrogate or placeholder for another object to control access to it.

#### 2.结构
* Subject(抽象主题角色): Proxy和RealSubject的共同接口，定义了他们需要的实现方法
* Proxy(代理主题角色): 增加额外的操作并调用RealSubject中的方法
* RealSubject(真实主题角色): 定义某种需要完成的操作

故事描述: Client通过代理主题角色调用真实主题角色中的方法

调用者: Client, Proxy
被调用者: RealSubject

#### 3.实现

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/proxystructure.png)

* Remote proxy: 远程代理(如RMI)
* Virtual proxy: 小对象代替资源消耗大的对象
* Protect proxy: 控制对一个对象的访问，提供不同权限
* Cache proxy: 提供临时的存储空间
* Smart reference proxy: 对象被引用时提供额外操作

#### 4.应用

此例为保护代理(AccessValidator)和智能引用代理(Logger)的例子

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/searcher.png)

#### 5.优点

* 协调调用者和被调用者
* 增加代理类无需修改源码
* 远程代理可以在不同的机器上分布不同的操作，提高整体运行效率
* 其他的虚拟，保护，缓存代理的优点如上所示

#### 6.缺点

* 请求速度变慢
* 实现过程复杂

#### 7.适用环境

* RMI, EJB, Web Service, Spring AOP
* 根据不同的用处和代理的分类，可以用于远程访问，代替大对象，缓存，权限，对访问提供额外操作等...

#### 8.问题

* RMI例子
* Java动态代理** && 代码
* 虚拟代理的使用场景