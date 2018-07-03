[TOC]

# DesignPattern-LearningNotes-HibisciDai

设计模式学习笔记，个人博客文章同步

## 使用工具

processon在线UML类图：[processon](https://www.processon.com/i/5b0a404be4b0b0a47abf79c6)

Eclipse：Mars1

JDK：1.7

## 文章地址

[设计模式专题](https://hibiscidai.github.io/categories/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/)

[设计模式-01-设计模式七大设计原则](https://hibiscidai.github.io/2018/03/07/设计模式-01-设计模式七大设计原则/)

[设计模式-02-单例模式](https://hibiscidai.github.io/2018/03/14/设计模式-02-单例模式/)

[设计模式-03-工厂模式](https://hibiscidai.github.io/2018/03/21/设计模式-03-工厂模式/)

[设计模式-04-抽象工厂模式](https://hibiscidai.github.io/2018/03/26/设计模式-04-抽象工厂模式/)

[设计模式-05-建造者模式](https://hibiscidai.github.io/2018/03/28/设计模式-05-建造者模式/)

[设计模式-06-原型模式](https://hibiscidai.github.io/2018/04/02/设计模式-06-原型模式/)

[设计模式-07-适配器模式](https://hibiscidai.github.io/2018/04/04/设计模式-07-适配器模式/)

[设计模式-08-桥接模式](https://hibiscidai.github.io/2018/04/09/设计模式-08-桥接模式/)

[设计模式-09-组合模式](https://hibiscidai.github.io/2018/04/16/设计模式-09-组合模式/)

[设计模式-10-装饰器模式](https://hibiscidai.github.io/2018/04/18/设计模式-10-装饰器模式/)

[设计模式-11-外观模式](https://hibiscidai.github.io/2018/04/23/设计模式-11-外观模式/)

[设计模式-12-享元模式](https://hibiscidai.github.io/2018/04/25/设计模式-12-享元模式/)

[设计模式-13-代理模式](https://hibiscidai.github.io/2018/04/28/设计模式-13-代理模式/)

[设计模式-14-职责链模式](https://hibiscidai.github.io/2018/05/09/设计模式-14-职责链模式/)

[设计模式-15-命令模式](https://hibiscidai.github.io/2018/05/14/设计模式-15-命令模式/)

[设计模式-16-解释器模式](https://hibiscidai.github.io/2018/05/16/设计模式-16-解释器模式/)

[设计模式-17-中介者模式](https://hibiscidai.github.io/2018/05/21/设计模式-17-中介者模式/)

[设计模式-18-备忘录模式](https://hibiscidai.github.io/2018/05/23/设计模式-18-备忘录模式/)

[设计模式-19-观察者模式](https://hibiscidai.github.io/2018/05/28/设计模式-19-观察者模式/)

[设计模式-20-状态模式](https://hibiscidai.github.io/2018/05/30/设计模式-20-状态模式/)

[设计模式-21-策略模式](https://hibiscidai.github.io/2018/06/06/设计模式-21-策略模式/)

[设计模式-22-模板方法](https://hibiscidai.github.io/2018/06/11/设计模式-22-模板方法/)

[设计模式-23-迭代器](https://hibiscidai.github.io/2018/06/13/设计模式-23-迭代器/)

## 小结

### 七大原则

- 单一职责原则（Single Responsibility Principle）
  一个类只有一个职责。
- 开闭原则（Open Close Principle）
  对扩展开放对更改封闭。
- 里氏代换原则（Liskov Substitution Principle）
  子类替换掉父类,后程序正常运行且结果跟预测相同才能允许继。
- 依赖倒转原则（Dependence Inversion Principle）
  针对接口编程，不针对实现编；高层不依赖底层，依赖抽象。
- 接口隔离原则（Interface Segregation Principle）
  客户端不应该依赖它不需要的方法，类间的依赖关系应建立在最小的接口上。
- 合成/聚合复用原则（Composite Reuse Principle）
  构造函数中出现其他类/类使用调用其他类。
- 迪米特原则（Demeter Principle）
  不要和陌生人说话，最少知识原则。

### 创建型模式

>创建对象的同时隐藏创建逻辑的方式，不使用新的运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

- 单例模式（Singleton Pattern）
一个类仅有一个实例，并提供一个访问它的全局访问点。
- 工厂模式（Factory Pattern）
定义一个用于创建对象的接口，让子类决定实例化哪个类，一个类的创建延迟到其子类，这个类叫工厂。
- 抽象工厂模式（Abstract Factory Pattern）
提供一个创建一系列相关或者相关依赖对象的接口，而不需指定他们具体的类。
- 建造者模式（Builder Pattern）
将一个复杂对象的创建与表示分离，使得同样的创建过程可用不同的表示。
- 原型模式（Prototype Pattern）
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

### 结构型模式

>这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。

- 适配器模式（Adapter Pattern）
将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
- 桥接模式（Bridge Pattern）
把抽象化与实现化解耦，提供两者之间的桥接结构，使二者可以独立变化。
- 组合模式（Composite Pattern）
将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
- 装饰器模式（Decorator Pattern）
动态地给一个对象添加一些额外的职责。就增加功能来说装饰器模式相比生成子类更为灵活。
- 外观模式（Facade Pattern）
为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
- 享元模式（Flyweight Pattern）
运用共享技术有效地支持大量细粒度的对象。
- 代理模式（Proxy Pattern）
为其他独享提供一种代理以控制对这个对象的访问。

### 行为型模式

>特别关注对象之间的通信

- 职责链模式（Chain of Responsibility Pattern）
使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这些对象连成一条链，并沿着这条链传递该请求，知道有一个对象处理它位置。
- 命令模式（Command Pattern）
将一个请求封装为一个对象，从而使你可用不用的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。
- 解释器模式（Interpreter Pattern）
给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
- 中介者模式（Mediator Pattern）
用一个对象来封装一系列的对象交互，中介者使各对象直间不需要显式的相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互。
- 备忘录模式（Memento Pattern）
在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
- 观察者模式（Observer Pattern）
定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖它的对象都得到通知并被自动更新。
- 状态模式（State Pattern）
允许对象在内部状态发生改变时改变它的行为，对象看起来好像是修改了它的子类。
- 策略模式（Strategy Pattern）
定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。
- 模板模式（Template Pattern）
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
- 迭代器模式（Iterator Pattern）
提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
- 空对象模式（Null Object Pattern）
- 访问者模式（Visitor Pattern）

### J2EE模式

- MVC 模式（MVC Pattern）
- 业务代表模式（Business Delegate Pattern）
- 组合实体模式（Composite Entity Pattern）
- 数据访问对象模式（Data Access Object Pattern）
- 前端控制器模式（Front Controller Pattern）
- 拦截过滤器模式（Intercepting Filter Pattern）
- 服务定位器模式（Service Locator Pattern）
- 传输对象模式（Transfer Object Pattern）