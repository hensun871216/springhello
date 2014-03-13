package hensun.SpringHello;

import org.apache.log4j.Logger;

public class Log4jTest {
static Logger logger = Logger.getLogger(Log4jTest.class.getName());
//根据类名创建一个静态全局变量。
    public static void main(String[] args){
        logger.debug("Here is DEBUG messgae");      //Debug信息。 
        logger.info("Here is INFO message");
        logger.warn("Here is WARN message");
        logger.error("Here is ERROR message");
        logger.fatal("Here is FATAL message");
    }   
}
