package cn.phil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cn.phil")
public class TestBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestBean.class);
		PhilProperties bean = applicationContext.getBean(PhilProperties.class);
		bean.setName("123");
	}
}
