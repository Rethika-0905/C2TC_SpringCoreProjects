
package com.tnsif.springCore_Sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext var = new ClassPathXmlApplicationContext("appcontext.xml");
        
        College c1 = var.getBean("mvit", College.class);
        
        c1.display();
    }
}
