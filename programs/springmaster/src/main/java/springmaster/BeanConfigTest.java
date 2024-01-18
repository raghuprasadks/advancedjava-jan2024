package springmaster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springmaster.bean.Product;
import springmaster.bean.Student;

public class BeanConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		System.out.println("Product Bean");
		Product prod = context.getBean(Product.class);
		System.out.println(prod);
		
		System.out.println("Student Bean");
		Student stud = context.getBean(Student.class);
		System.out.println(stud);
		
		
		

	}

}
