package springmaster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springmaster.bean.Product;
import springmaster.bean.Student;

@Configuration
@ComponentScan(basePackages="springmaster.bean")
public class BeanConfiguration {
	
	@Bean
	public Student student() {
		Student stud = new Student();
		stud.name = "Rakesh";
		return stud;		
	}
	
	@Bean
	public Product product() {
		Product prod = new Product();
		prod.setCode(1);
		prod.setName("Laptop");
		return prod;
	}
}
