package DemOnSpring.DemOnSpringS53;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
     //To link the App class to XML file
     ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
     //get Employees Bean
     Employees e1=(Employees)context.getBean("emp1Bean");
     System.out.println(e1);
    }
}
 
