package springmaster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springmaster.bean.Customer;
import springmaster.bean.Employee;

public class SpringGettingStarted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring master");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Get bean with class name");
		Customer customerBean = applicationContext.getBean(Customer.class);
		System.out.println(customerBean);
		
		System.out.println("Employee - Get bean with bean id");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee.info());
		
		
		

	}

}
