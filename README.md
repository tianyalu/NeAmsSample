# `ActivityManagerService`架构设计源码分析

[TOC]

## 一、核心理论

### 1.1 基础概念

#### 1.1.1 什么是`ActivityManagerService`

`AMS`即`ActivityManagerService`承担了`Android`四大组件的启动、切换、调度以及进程的管理工作，掌握了所有应用的创建、启动、管理，是`Android`中最核心的服务。

![image](https://github.com/tianyalu/NeAmsSample/raw/master/show/ams.png)

#### 1.1.2 组件与`AMS`的通讯方式

`Activity`最后通过调用`ActivityManagerProxy`，然后通过`Binder`机制同`ActivityManagerService`通讯，因为两种属于不同的进行（`AMS`属于系统进程）。

![image](https://github.com/tianyalu/NeAmsSample/raw/master/show/components_ams_communication.png)

#### 1.1.3 `AMS`体系化关系图

`AMS`体系化关系图如下图所示：

![image](https://github.com/tianyalu/NeAmsSample/raw/master/show/ams_relationship.png)

### 1.2 源码分析

#### 1.2.1 `startService`流程

![image](https://github.com/tianyalu/NeAmsSample/raw/master/show/service_start_processes.png)

#### 1.2.2 `Activity`跨进程跳转源码分析

从`Activity`跳转到另一个`Activity`经历了两次跨进程过程：首先从用户端进程调用系统进程，然后系统进程调用用户端进程回到用户端，源码调用时序图如下图所示：

![image](https://github.com/tianyalu/NeAmsSample/raw/master/show/activity_launching_sequence_across_processes.png)





















