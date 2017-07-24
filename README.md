# spring-cloud-consul-config

先将consul consul web-ui 启动

在consul kv新建 config/application,dev/configuration  全局配置示例：dev代表开发环境  test代表测试环境  prod代表生产环境        
       
在consul kv新建 config/consul-info/configuration    consul-info 是spring: application: name 的取值

将bootstarp.yml中注释部分转移到consul的KV中去


