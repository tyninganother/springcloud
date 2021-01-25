1. 注册中心集群版单机配置
hosts中
127.0.0.1 eureka.server.1.com
127.0.0.1 eureka.server.2.com


2. 某一种服务是集群的话，那么使用主机名字去访问集群的话，那么我们就需要使用负载均衡。先不用spring cloud自带的组件来做。使用一个RestTemplate的注解@LoadBalanced来做
3. @LoadBalanced 是如何做到负载均衡的呢？
