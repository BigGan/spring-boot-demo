package com.ghj.spring_boot_demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	
	/**
	 * Spring boot 默认使用的是jackson框架
	 * @return
	 */
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo=new Demo();
		demo.setId(1);
		demo.setName("干海杰");
		demo.setCreateTime(new Date());
		demo.setRemark("备注");
		return demo;
	}
}
