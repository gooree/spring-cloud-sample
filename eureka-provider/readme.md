# Spring Cloud Eureka(客户端)

Spring Cloud Eureka是Spring Cloud Netflix项目下的服务治理模块。而Spring Cloud Netflix项目是Spring Cloud的子项目之一，主要内容是对Netflix公司一系列开源产品的包装，它为Spring Boot应用提供了自配置的Netflix OSS整合。通过一些简单的注解，开发者就可以快速的在应用中配置一下常用模块并构建庞大的分布式系统。它主要提供的模块包括：服务发现（Eureka），断路器（Hystrix），智能路由（Zuul），客户端负载均衡（Ribbon）等。

## 如何用Eureka实现服务治理

1. 创建服务注册中心（eureka-server）
创建一个基础的Spring Boot工程，命名为eureka-server，并在pom.xml中引入需要的依赖内容。通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。
2. 创建服务提供方（eureka-provider）
创建一个基础的Spring Boot应用，在pom.xml中加入spring-cloud-starter-eureka依赖，实现相关的Controller服务接口，最后在应用主类中添加@EnableDiscoveryClient注解，该注解能激活Eureka中的DiscoveryClient实现，自动将服务注册到指定的eureka-server上。
