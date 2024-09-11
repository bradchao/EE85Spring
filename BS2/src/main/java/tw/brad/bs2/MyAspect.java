package tw.brad.bs2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	@Before("execution(* tw.brad.bs2.BigLottery.*(..))")
	public void beforeTest1() {
		System.out.println("beforeTest1()");
	}

	@Before("execution(* tw.brad.bs2.Lottery.*(..))")
	public void beforeTest2() {
		System.out.println("beforeTest2()");
	}

	@Before("execution(* tw.brad.bs2.BigLottery.m1(..))")
	public void beforeTest3() {
		System.out.println("beforeTest3()");
	}

	@After("execution(* tw.brad.bs2.BigLottery.m1(..))")
	public void beforeTest4() {
		System.out.println("afterTest4()");
	}
	
	@Around("execution(* tw.brad.bs2.BigLottery.poker1(..))")
	public Object aroundTest5(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		System.out.println("==> " + (System.currentTimeMillis()-start));
		return obj;
	}
	
	
	
}
