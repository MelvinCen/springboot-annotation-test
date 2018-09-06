package cn.melvin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.melvin.dao")
public class SpringbootAnnotationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAnnotationTestApplication.class, args);
	}
}
