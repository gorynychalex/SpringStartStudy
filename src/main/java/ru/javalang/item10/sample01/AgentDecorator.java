package ru.javalang.item10.sample01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Класс Декоратора Агента
 * MethodInterceptor - interface для реализации совета, окружающего точки соединения
 * MethodInvocation - object для вызова метода, снабжаемого советом
 */
public class AgentDecorator implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("James ");
        Object result = invocation.proceed();
        System.out.println("!");
        return result;
    }
}
