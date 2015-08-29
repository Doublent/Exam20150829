package com.hand;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//@Aspect
public class Logging {

   @Pointcut("execution(* com.hand.*.*(..))")
   private void selectAll(){}

   @Before("selectAll()")
   public void beforeAdvice(){
      System.out.println("Before Insert Film Data");
   }
 
   @After("selectAll()")
   public void afterAdvice(){
      System.out.println("After Insert Film Data");
   }

   @AfterReturning(pointcut = "selectAll()", returning="retVal")
   public void afterReturningAdvice(Object retVal){

	   System.out.println("");
   }

   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
   public void AfterThrowingAdvice(IllegalArgumentException ex){

	   System.out.println("");
   } 
}
