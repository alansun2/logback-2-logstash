# logback-2-logstash

#### 介绍
##### springboot项目 通过logback记录日志到ELK
##### 这里主要说明记录日志到logstash的过程
##### github官方文档（当时是5.3版本）
###### - https://github.com/logstash/logstash-logback-encoder/tree/logstash-logback-encoder-5.3 

#### 使用说明

1. 启动ELK
2. 导入项目
3. 启动项目

#### 文档说明

1. spring-boot官方文档
- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html
2. logback官方文档
- https://logback.qos.ch
3. 记录到文件
TimeBasedRollingPolicy 与 SizeAndTimeBasedRollingPolicy
SizeAndTimeBasedRollingPolicy extend TimeBasedRollingPolicy
SizeAndTimeBasedRollingPolicy可以设置每个文件的大小，如果文件大于