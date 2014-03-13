package hensun.SpringHello;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAround {
	
	public AudienceAround() {
	}
	
	@Pointcut(value="execution(* *.perform(..))")
	public void performerMethod() {}
	
	@Around(value="performerMethod()") 
	public void aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
		try{
			System.out.println("take steats in aroud");
			System.out.println("turn off cell phone in aroud");
			Object object = proceedingJoinPoint.proceed();
			System.out.println("Ha ha in around");
		} catch (Throwable e) {
			System.out.println("error happens in around");
			e.printStackTrace();
		}
	}

}
