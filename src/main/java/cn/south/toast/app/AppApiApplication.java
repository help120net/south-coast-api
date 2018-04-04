package cn.south.toast.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import cn.south.toast.common.config.DruidAutoConfiguration;

/**
 * 
 * @author huangbh
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "cn.south.toast")
@Import({  DruidAutoConfiguration.class})
@MapperScan(annotationClass = Repository.class, basePackages = { "cn.south.toast"})
@EnableTransactionManagement
@EnableAsync
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, 
//		DataSourceTransactionManagerAutoConfiguration.class})
public class AppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApiApplication.class, args);
	}
	
	
}
