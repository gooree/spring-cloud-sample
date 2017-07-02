# Spring Cloud Zookeeper(客户端)

Spring Clound Zookeeper为Spring Boot应用提供zookeeper集成。

## 如何用Zookeeper实现服务治理

1. 安装zookeeper，启动zookeeper服务。
2. 创建基础Spring Boot应用，在pom.xml中加入spring-cloud-starter-zookeeper-discovery依赖，实现相关的Controller服务接口，最后在应用主类中添加@EnableDiscoveryClient注解，该注解能激活基于Spring Clound Zookeeper发现的自动配置。如果Zookeeper位于localhost:2181以外的地方，则需要修改以下配置项来定位zk服务器：

	spring.cloud.zookeeper.connect-string=localhost:2181
