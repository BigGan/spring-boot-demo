package com.ghj.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//extends WebMvcConfigurerAdapter
public class App 
{
	
	
/*    @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		*//**
		 * 需要先定义一个 converter 转换消息的对象
		 * 添加fastjson配置信息
		 * converter中添加配置信息
		 * 将converter添加到converters中
		 *//*
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
         fastJsonConfig.setSerializerFeatures(
                 SerializerFeature.PrettyFormat
         );
         fastConverter.setFastJsonConfig(fastJsonConfig);
 		
     	 converters.add(fastConverter);
	}*/

	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
	
	
	public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
