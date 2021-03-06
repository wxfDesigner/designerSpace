package com.tdh.urlInterceptor.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tdh.urlInterceptor.model.Student;

@FeignClient(name = "provider-message")
public interface StudentRemote {

	@RequestMapping("/findStudent")
	public String findById(@RequestBody Student student);
	
	@RequestMapping("/helloWorld")
	public String helloWorld();

}
