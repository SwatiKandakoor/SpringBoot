//package com.xworkz.crud.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//@Aspect
//@Component
//public class EmpolyeAspect {
//	
//	@Pointcut("execution(* com.xworkz.crud.controller.*.*(..))")
//	public void loggingPointCut() {
//		
//	}
//	
//	@Before("loggingPointCut()")
//	public void before(JoinPoint joinPoint) {
//		System.out.println("Before method invoked ::"+ joinPoint.getSignature());
//	}
//	
//	@After("loggingPointCut()")
//	public void after(JoinPoint joinPoint) {
//		System.out.println("After method invoked ::"+ joinPoint.getSignature());
//	}
//	
//  // Logger log=LoggerFactory.getLogger(LoggingAdvice.class);
//   
//   @Pointcut(value="execution(* com.xworkz.crud.controller.*.*(..))")
//   public void myPointcut() {
//	   
//   }
//	@Around("myPointcut")
//	public Object applicationLogger(ProceedingJoinPoint pjp)throws JsonProcessingException {
//		ObjectMapper mapper=new ObjectMapper();
//		String methodName=pjp.getSignature().getName();
//		String className=pjp.getTarget().getClass().toString();
//		Object[] array=pjp.getArgs();
//		System.out.println("method invoked "+className + " :" + methodName + "()" + "arguments :"+mapper.writeValueAsString(array) );
//		
//	//	Object object=pjp.proceed();
//		System.out.println(className + " :" + methodName + "()" + "Response :"+mapper.writeValueAsString(object) );
//
//		return object;
//
//	}
//
//}
