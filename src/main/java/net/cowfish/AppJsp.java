
package net.cowfish;

import net.cowfish.datasource.DBConfig1;
import net.cowfish.datasource.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication // @ComponentScan("com.itmayiedu.app")
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
// @ComponentScan("com.itmayiedu.controller")
@MapperScan(basePackages = { "net.cowfish.mapper" })
@EnableAsync
@EnableScheduling
// @EnableAutoConfiguration
public class AppJsp {

	public static void main(String[] args) {
		SpringApplication.run(AppJsp.class, args);
	}

}
