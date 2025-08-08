package DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beansDependency.xml");
		
		//setter injection
		Student th=con.getBean("yakesh",Student.class);
		Student rv=con.getBean("arun",Student.class);
		
		th.showInfo();
		rv.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("john",Student1.class);
		Student1 hm=con.getBean("devi",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}
