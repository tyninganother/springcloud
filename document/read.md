1. 注册中心集群版单机配置
hosts中
127.0.0.1 eureka.server.1.com
127.0.0.1 eureka.server.2.com


2. 某一种服务是集群的话，那么使用主机名字去访问集群的话，那么我们就需要使用负载均衡。先不用spring cloud自带的组件来做。使用一个RestTemplate的注解@LoadBalanced来做
3. @LoadBalanced 是如何做到负载均衡的呢？
4. 在eureka控制台中显示的application的名字不好区别：
   可以修改在控制台显示的名字，就是在eureka的下一个节点做一个instance: instance-id:
   如果先让显示的名字在鼠标放上去显示ip的话可以配置prefer-ip-address: true
5. 可以在微服务中获得注册中心注册的微服务的地址等信息
    可以使用@EnableDiscoveryClient标记Application启动类，然后使用