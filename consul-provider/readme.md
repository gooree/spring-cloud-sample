# Spring Clound Consul

## What is Consul?

  Consul has multiple components, but as a whole, it is a tool for discovering and configuring services in your infrastructure. It provides several key features:

- Service Discovery（服务发现）

  Clients of Consul can provide a service, such as api or mysql, and other clients can use Consul to discover providers of a given service. Using either DNS or HTTP, applications can easily find the services they depend upon.

- Health Checking（健康检查）

  Consul clients can provide any number of health checks, either associated with a given service ("is the webserver returning 200 OK"), or with the local node ("is memory utilization below 90%"). This information can be used by an operator to monitor cluster health, and it is used by the service discovery components to route traffic away from unhealthy hosts.

- KV Store（Key/Value存储）

  Applications can make use of Consul's hierarchical key/value store for any number of purposes, including dynamic configuration, feature flagging, coordination, leader election, and more. The simple HTTP API makes it easy to use.

- Multi Datacenter（多数据中心）

  Consul supports multiple datacenters out of the box. This means users of Consul do not have to worry about building additional layers of abstraction to grow to multiple regions.

## Consul Commands(CLI)

1. 启动Consul服务端

	consul agent -dev
	
## 如何用Consul实现服务治理
创建一个基础的Spring Boot工程，在pom.xml中加入spring-cloud-starter-consul-discovery依赖,接下来再修改一下application.properites，将consul需要的配置信息加入即可。示例如下：

	spring.cloud.consul.host=localhost
	spring.cloud.consul.port=8500

到此为止，基于consul实现服务治理的服务提供者就完成了。前文我们已经有提到过服务发现的接口DiscoveryClient是Spring Cloud对服务治理做的一层抽象，可以屏蔽Eureka和Consul服务治理的实现细节，我们的程序不需要做任何改变，只需要引入不同的服务治理依赖，并配置相关的配置属性就能轻松的将微服务纳入Spring Cloud的各个服务治理框架中。
