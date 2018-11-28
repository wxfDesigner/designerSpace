package com.tdh.urlInterceptor.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName: Application
 * @Description: ()
 * @author wxf
 * @date 2018年11月26日 下午2:41:53
 *
 */
@EnableDiscoveryClient // 开启发现服务功能
@EnableFeignClients
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.tdh.urlInterceptor.*" })
public class Application {
	static Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("urlInterceptor consumer started successfully");
	}

	@LoadBalanced // 使用负载均衡机制
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
