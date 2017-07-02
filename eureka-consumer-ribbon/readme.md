# Eureka Consumer Ribbon

## What is Spring Clound Ribbon?
Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具。它是一个基于HTTP和TCP的客户端负载均衡器。它可以通过在客户端中配置ribbonServerList来设置服务端列表去轮询访问以达到均衡负载的作用。

## 如何消费已注册的服务
1. 引入spring-cloud-starter-ribbon依赖
2. 在主应用类上标注@EnableDiscoveryClient，并初始化RestTemplate实例，且为RestTemplate实例增加@LoadBalanced注解
3. 在调用类注入RestTemplate实例，直接通过RestTemplate发起请求。请求url为:http://{provider-application-name}/{mapping-uri}。

## 说明
1. provider-application-name为服务提供方实例名
2. mapping-uri为实际的接口地址

PS：Spring Cloud Ribbon有一个拦截器，它能够在这里进行实际调用的时候，自动的去选取服务实例，并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。