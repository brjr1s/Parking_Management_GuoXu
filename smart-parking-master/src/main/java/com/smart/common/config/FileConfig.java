package com.smart.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * file映射项目外文件夹
 * 1 https://blog.52itstyle.vip
 * @author 2023
 */
@Configuration
public class FileConfig implements WebMvcConfigurer {

	@Value("${file.path}")
	private String filePath;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/file/**").addResourceLocations("file:" + filePath+"/");
	}
}
