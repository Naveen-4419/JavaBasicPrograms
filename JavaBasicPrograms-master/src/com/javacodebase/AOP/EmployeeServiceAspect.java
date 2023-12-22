//package com.javacodebase.AOP;
//
//@Aspect
//@Component
//public class EmployeeServiceAspect {
//    @Before(value ="execution(* com.servicename.*(..)) and args(name, empId)")
//    public void beforeAdvice(JointPoint jointPoint, String name, String empId){
//        System.out.println("Before method:" + joinPoint.getSignature());
//        System.out.println("Creating Employee with name - " + name + " and id - " + empId);
//    }
//    @After(value ="execution(* com.servicename.*(..)) and args(name, empId)")
//    public void afterAdvice(JointPoint jointPoint, String name, String empId){
//        System.out.println("After method:" + joinPoint.getSignature());
//        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
//    }
//}
//
////@SpringBootApplication
////@EnableAspectJAutoProxy(proxyTargetClass = true)
