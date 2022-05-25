package ru.javalang;

public class Main {
    public static void main(String[] args) {
        MessageRenderIf render = MessageSupportFactory
                .getInstance().getMessageRender();
        MessageProviderIf provider = MessageSupportFactory
                .getInstance().getMessageProvider();
        render.setMessageProvider(provider);
        render.render();
    }
}
