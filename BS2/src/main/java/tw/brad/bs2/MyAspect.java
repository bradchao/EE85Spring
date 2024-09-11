package tw.brad.bs2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Before("execution(* tw.brad.bs2.BigLottery.*(..))")
	public void beforeTest1() {
		System.out.println("beforeTest1()");
	}

	@Before("execution(* tw.brad.bs2.Lottery.*(..))")
	public void beforeTest2() {
		System.out.println("beforeTest2()");
	}

	@Before("execution(* tw.brad.bs2.Lottery.createLottery(..))")
	public void log() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
			Date date = new Date();
			String time =  sdf.format(date);
			
//			Resource res = resourceLoader.getResource("classpath:mylog.txt");
			
			File file = new File("log/mylog.txt");
			BufferedWriter br = new BufferedWriter(new FileWriter(file, true));
			br.write(String.format("%s : mesagge\n", time));
			br.flush();
			br.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
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
