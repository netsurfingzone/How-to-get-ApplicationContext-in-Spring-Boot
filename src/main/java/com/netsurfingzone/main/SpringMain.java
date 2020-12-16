package com.netsurfingzone.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@SpringBootApplication
@ComponentScan(basePackages = "com.netsurfingzone.*")
public class SpringMain {
	
	  private static ResourceLoader resourceLoader;
	  public void setResourceLoader(ResourceLoader resourceLoader) {
	    this.resourceLoader = resourceLoader; 
	  }

	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = SpringApplication.run(SpringMain.class, args);
	}
}
