package ru.javalang;

public class Main {
    public static void main(String[] args) {
        MessageRenderIf messageRender = new StandartOutMessageRenderer();
        MessageProviderIf messageProvider = new MessageProvider();
        messageRender.setMessageProvider(messageProvider);
        messageRender.render();
    }
}
