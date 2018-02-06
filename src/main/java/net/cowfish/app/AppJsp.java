
package net.cowfish.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("net.cowfish.controller")
@MapperScan(basePackages={"net.cowfish.mapper"})
@EnableAutoConfiguration
public class AppJsp {

	public static void main(String[] args) {
		SpringApplication.run(AppJsp.class, args);
	}
}
