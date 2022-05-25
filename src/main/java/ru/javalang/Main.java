package ru.javalang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                        "app-config.xml");

        MessageRenderIf render
                = context.getBean("renderer",
                MessageRenderIf.class);
        render.render();
    }
}
