### Decorator pattern
动态扩展对象功能，代替继承

#### 1.定义
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing
 for extending functionality.
 
#### 2.结构

* Component(抽象构件): Concrete component和Decorator的共同父类
* Concrete component(具体构件): 定义具体的构件对象
* Decorator(抽象装饰类): 包含一个component，并且给Concrete component添加职责
* Concrete decorator(具体装饰类): Decorator具体方法实现

#### 3.实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/decoratorstructure.png)

* Transparent: 声明为component类型，简化区别，允许多次装饰（允许单独调用方法吗？好像经过强制转换可以调用？）

* Semi-transparent: 允许单独调用concrete decorator中的新方法，不允许对同一个对象多次装饰（透明的就可以多次装饰吗？ ）

#### 4.应用
Java I/O 设计, swing图形界面

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/visualcomponent.png)

#### 5.优点

* 代替继承，减少类的个数
* 动态扩展对象的功能，对一个对象进行多次装饰
* Concrete decorator和concrete component可以独立变化

#### 6.缺点

* 产生很多小对象(?)，decorator的嵌套使得debug困难

#### 7.适用环境

* 动态透明的给单个对象添加职责/功能
* 当继承不能使用时，如final class或者使用继承后类的个数太多