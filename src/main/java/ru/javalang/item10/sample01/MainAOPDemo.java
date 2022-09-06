package ru.javalang.item10.sample01;

import org.springframework.aop.framework.ProxyFactory;

public class MainAOPDemo {
    public static void main(String[] args) {
        Agent agent = new Agent();

        /**
         * Процедура связывания совета типа AgentDecorator (метода invoke()) с прикладным кодом
         * Объект класса ProxyFactory создает заместителя и привязывает к нему совет
         */
        ProxyFactory proxyFactory = new ProxyFactory();

        // Передача совета фабрике - объекту ProxyFactory
        proxyFactory.addAdvice(new AgentDecorator());

        // Указание цели для связываения
        proxyFactory.setTarget(agent);

        // Вызов объекта заместителя
        Agent proxyAgent = (Agent) proxyFactory.getProxy();

        agent.speak();

        System.out.println();

        proxyAgent.speak();
    }
}
