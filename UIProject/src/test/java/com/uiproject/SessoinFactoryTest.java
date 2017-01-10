package com.uiproject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author KUMAR
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
//@ContextConfiguration({"locations="classpath*:spring.xml"})
public class SessoinFactoryTest {
@Autowired
SessionFactory sf;
	@Test
	public void test() {
		System.out.println(sf);
		assertNotNull(sf);
	}
	/*public static void main( String[] args )
    {
    	ApplicationContext context =
    		new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sf = (SessionFactory) context.getBean("sessionFactory");
        
        System.out.println(sf);

    }*/

}
