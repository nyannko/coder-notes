### Iterator pattern

统一遍历方法

#### 1.定义
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

#### 2.结构

* Aggregate(抽象聚合类): 储存管理对象
* ConcreteAggregate(具体聚合类): 实现具体创建Iterator的方法
* Iterator(抽象迭代器): 声明遍历方法的接口
* ConcreteIterator(具体迭代器): 实现具体的遍历方法

#### 3.实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/iteratorstructure.png)

#### 4.应用
Java集合类
![](https://ws4.sinaimg.cn/large/006tNc79gy1fzku6ozrbzj317e0qmauf.jpg)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/abstractobjectlist.png)

#### 5.优点
* 不同模式遍历聚合对象
* 简化聚合类，分离存储和遍历
* 新增聚合类或者迭代器方便
#### 6.缺点
* 类的个数成对增加
* 设计难度大
#### 7.适用环境
* 访问一个聚合对象的内容而无需暴露它的内部表示
* 需要为一个聚合对象提供很多遍历方式
* 为遍历不同的对象提供一个统一的接口

#### 8.问题
