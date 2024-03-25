# 進み！
## what's this?
>这里即使我的JavaLearningHistory，也是markdown实践场地
> **Some birds are not close, because they are too bright.**
> 
> **Good Luck to myself**

---

## 目录

### 概述

-[what's this?](#what'sthis?)

### 计划清单(这里试用一下任务列表功能)

- [小计划](#小计划)
- [中计划](#中计划)
- [大计划](#大计划)

### JavaLearning

- [注释](#1注释)
- [关键字](#2关键字)
- [字面量](#3字面量)
- [变量](#4变量)
- [数据类型](#5数据类型)
- [标识符](#6标识符)

---

## 计划清单(这里试用一下任务列表功能)

### 小计划
- [x] 活着
- [ ] 死去

### 中计划

### 大计划

---

## JavaLearning

### 1.注释
- 单行注释:Ctrl + /
- 多行注释:Ctrl +Shift+ /

### 2.关键字
Java关键字是编程语言中的预定义的具有特殊含义的词汇,关键字字母全部小写,在编辑器中有特殊颜色标记
- 修饰符关键字:public、protected、private、static、final、abstract
- 访问控制关键字:public、protected、private、default（默认）
- 类、接口和包关键字:class、interface、enum、package、import、extends、implements
- 方法关键字:void、return、this、super
- 流程控制关键字:if、else、switch、case、default、while、do、for、break、continue、return
- 异常处理关键字:try、catch、finally、throw、throws
- 逻辑关键字:true、false、null
- 其他关键字:new、instanceof、synchronized、transient、volatile、assert

**关键字有很多,没有必要去一一记忆**
  
### 3.字面量

- 整数字面量：表示整数值，可以使用十进制、八进制（以0开头）和十六进制（以0x或0X开头）表示法。例如：42, 012, 0xFF 
- 浮点数字面量：表示浮点数值，包括普通的浮点数和科学计数法表示。例如：3.14, 2.0e-5。
- 字符字面量：表示单个字符，使用单引号括起来。例如：'A', '1', '@'
- 字符串字面量：表示一个字符串，使用双引号括起来。例如："Hello,World!","Java"
- 布尔字面量：表示布尔值，只有两个取值：true和false
- null 字面量：表示空引用，用于表示对象引用不指向任何有效的对象。
- 转义序列：一些特殊的字符序列，以反斜线 \ 开头，用于表示无法直接输入的字符，如换行符\n、制表符\t等
- 数组字面量：用花括号 {} 表示，用于初始化数组。例如：{1, 2, 3}
- 枚举常量：枚举类型的常量值，表示枚举中的特定选项
- 字符编码字面量：表示字符的Unicode编码，以\u开头，后面跟着四个十六进制数字。例如：\u0041 表示字符‘A’

一点小技巧：
- 不带小数点的数字都是整数类型的字面量
- 只要带了小数点，那么就是小数类型的字面量
- 只要用双引号引起来的，不管里面的内容是什么，不管里面有没有内容，都是字符串类型的字面量
- 字符类型的字面量必须用单引号引起来，不管内容是什么，但是个数有且只能有一个
- 布尔类型的字面量只有两个值，true、false
- 空类型的字面量只有一个值，null

### 4.变量

格式：数据类型 变量名 = 数据值;

变量名不能重复
在一条语句中，可以定义多个变量，但是这种方式影响代码的阅读，所以了解一下即可
变量在使用之前必须要赋值

### 5.数据类型

### 6.标识符
