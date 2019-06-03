### Command pattern

封装不同的command，在Invoker中一次执行

#### 1.定义
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log 
requests, and support undoable operations.

#### 2.结构
* Command(抽象命令类): 抽象类接口，声明了执行具体请求的execute()方法
* ConcreteCommand(具体命令类): 实现抽象命令类中的具体方法
* Invoker(调用者): 调用Command中的方法
* Receiver(接收者): 执行与请求的相关操作

#### 3.实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/commandstructure.png)

#### 4.应用
命令队列，undo redo，宏命令

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/functionbutton.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/calculationform.png)

#### 5.优点

* 请求者，接收者解耦
* 新命令容易加入系统中
* 比较容易设计一个命令队列或者宏命令
* undo & redo

#### 6.缺点

* 系统中过多具体命令类

#### 7.适用环境

参见优点

#### 8.问题

为什么可以用在undo redo上

宏命令(组合+命令)没仔细看
