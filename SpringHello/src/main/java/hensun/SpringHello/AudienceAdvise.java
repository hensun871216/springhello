package hensun.SpringHello;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AudienceAdvise implements MethodBeforeAdvice,
		AfterReturningAdvice, ThrowsAdvice {
	private Audience audience;


	public AudienceAdvise() {
	}

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		audience.applaud();
	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		audience.takeSeats();
		audience.turnOffCellPhone();
	}
	
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

}
