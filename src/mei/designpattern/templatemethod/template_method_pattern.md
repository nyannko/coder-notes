### Template method pattern

模版方法模式是结构最简单的类行为型设计模式，其结构只存在于父类和子类的继承关系

#### 1.定义

The template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an 
operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.

#### 2.结构

父类为抽象类，包含template method，其中包括3种不同的方法

* abstract class(抽象类): template method (including abstract method, concrete method, hook method)

```$xslt
1. abstract method: 抽象方法，子类必须重写

2. concrete method: 具体方法，子类可以对其进行覆盖/继承

3. hook method: 父类中存在一个方法为空/默认实现，子类对其进行覆盖/继承
```

* concrete class(具体子类): override abstract method  

#### 3.实现

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/templatemethodstructure.png)

#### 4.应用
   
1. bank account

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/account.png)

2. data viewer

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/dataviewer.png)


#### 5.优点

* 父类形式化的定义某个方法，子类并不会改变算法中的执行次序

* 代码复用，提取子类中的公共行为

* 反向控制结构，子类覆盖父类中的hook method来决定某个步骤是否执行

#### 6.缺点

* 父类可变基本方法太多，类的个数增加，系统庞大，设计抽象

#### 7.适用环境
* 有模版：一次性实现一个算法的不变部分

* 复用：子类的公共行为提取到父类中避免代码重复

* 钩子方法：通过子类决定父类的某个方法是否执行，实现反向控制
