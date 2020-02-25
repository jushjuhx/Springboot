# 一、介绍
## 1.1 简介
轻松创建可独立运行的、生产级的基于Spring的应用程序。可使用"java -jar app.jar"方式或者传统的"war"包方式运行该程序。
## 1.2 系统要求
Spring Boot 2.0.0.RELEASE需要Java 8或9以及 Spring Framework 5.0.4.RELEASE或更高版本。
## 1.3 支持Servlet容器
Tomcat8.5、Jetty9.4、Undertow 1.4
## 1.4 相关引用
`mvn dependency:tree`
1. spring-boot-starter-web -> spring-boot-starter-json -> jackson-databind 也就是默认自带jackson