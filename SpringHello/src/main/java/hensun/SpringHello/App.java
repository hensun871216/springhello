package hensun.SpringHello;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;
import org.aspectj.weaver.loadtime.definition.Definition.ConcreteAspect;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


/**
 * Hello world!
 *
 */
public class App {
	GreetingService greetingService;
	private static Logger logger = Logger.getLogger("app");
    public static void main( String[] args ) throws Exception{
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "871216") ;
    	PreparedStatement preparedStatement =  (PreparedStatement) connection.prepareStatement("select username from users limit 1");
    	ResultSet resultSet	 = preparedStatement.executeQuery();
    	if (resultSet.next()) {
    		String username = resultSet.getString(1);
    		System.out.println("Hello World : " + username );
    	}
//    	logger.warn("Hello World");
//    	PrintStream out =  System.out;
//    	try {
//			PrintStream newOut = new PrintStream("./abc.txt");
//			System.setOut(newOut);
//			System.out.println("Hello World");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			System.setOut(out);
//		}
    	
//    	BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("C:\\eclipse workspace\\SSH\\SpringHello\\src\\main\\java\\hensun\\SpringHello\\hello.xml"));
//    	App app = (App) beanFactory.getBean("app");
//    	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\eclipse workspace\\SSH\\SpringHello\\src\\main\\java\\hensun\\SpringHello\\hello.xml");
////    	App app = (App) applicationContext.getBean("app");
////    	app.greetingService.sayGreeting();
//    	Performer performer = (Performer) applicationContext.getBean("insttuments");
//    	performer.perform();
    	
    }
	public GreetingService getGreetingService() {
		return greetingService;
	}
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
    
    
}
