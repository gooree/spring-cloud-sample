# Eureka Consumer Feign

## What is Spring Cloud Feign?
Spring Cloud Feign是一套基于Netflix Feign实现的声明式服务调用客户端。它使得编写Web服务客户端变得更加简单。我们只需要通过创建接口并用注解来配置它既可完成对Web服务接口的绑定。它具备可插拔的注解支持，包括Feign注解、JAX-RS注解。它也支持可插拔的编码器和解码器。Spring Cloud Feign还扩展了对Spring MVC注解的支持，同时还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。

## 如何消费已注册的服务
1. 引入spring-cloud-starter-feign依赖
2. 在主应用类上标注@EnableDiscoveryClient、@EnableFeignClients
3. 创建一个Feign的客户端接口定义。使用@FeignClient注解来指定这个接口要调用的服务名称，接口中方法使用Spring MVC注解来绑定服务提供方的Restful接口。
4. 在服务调用类中注入客户端接口实例，直接调用该实例的方法即可。

## 说明
由于Feign是基于Ribbon实现的，所以它自带了客户端负载均衡功能。
