package shenzhen.allenyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"shenzhen.allenyang.dao"})
public class AllenyangApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllenyangApplication.class, args);
	}

}
