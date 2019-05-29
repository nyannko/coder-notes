### Composite pattern

* 树形，层次，部分-整体

组合多个对象形成树形结构来表示具有部分-整体关系的层次结构。组合模式让客户端可以统一对待单个对象和组合对象

#### 1.定义
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual
objects and compositions of objects uniformly.

#### 2.结构
* Component(抽象构件): interface or abstract class, declare CRUD methods for leaf and composite
* Leaf(叶子构件): no children, used to catch exception
* Composite(容器构件): 容器节点对象，包含容器节点和叶子节点，可以进行递归调用

Composite和Component形成聚合关联的关系，Composite中可以同时包含Composite和Leaf，形成树形关系

#### 3.实现
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/transparentcompositestructure.png)

![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/safecompositestructure.png)

缺点：一个不安全一个不透明

#### 4.应用

目录，菜单，组织结构

杀毒软件对Folder和File进行杀毒
![](https://raw.githubusercontent.com/nyannko/coder-notes/master/img/antivirus.png)

#### 5.优点

* 清楚的定义分层次的对象，为树形结构的面向对象实现提供了一种灵活的解决方案
* Client一致使用一个组合结构或者其中的单个对象，简化Client代码
* 新增容器和叶子节点方便

#### 6.缺点

* 很难对容器中的构件进行限制，因为继承自相同的抽象层，需要进行运行时类型检查


#### 7.适用环境

* 分层次的结构中需要忽略整体和部分的差异
* 树形结构
* 系统中需要分离出容器和叶子对象