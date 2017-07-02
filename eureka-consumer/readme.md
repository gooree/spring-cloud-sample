# Eureka Consumer Basic

## 如何消费已注册的服务
1. 引入spring-cloud-starter-eureka依赖
2. 在主应用类上标注@EnableDiscoveryClient，并初始化RestTemplate实例
3. 在调用类注入LoadBalancerClient和RestTemplate实例，先通过loadBalancerClient的choose函数来负载均衡的选出一个eureka-client的服务实例（ServiceInstance），然后通过该对象中的信息拼接出访问接口的详细地址，最后再利用RestTemplate对象实现对服务提供者接口的调用。
