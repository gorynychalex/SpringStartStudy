package ru.javalang;

import org.springframework.beans.factory.annotation.Autowired;

public class StandartOutMessageRenderer implements MessageRenderIf{

    private MessageProviderIf messageProvider;

    @Override
    public void render() {
        if(messageProvider == null){
            throw new RuntimeException("Провайдер пуст!");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProviderIf messageProviderIf) {
        this.messageProvider = messageProviderIf;
    }

    @Override
    public MessageProviderIf getMessageProvider() {
        return this.messageProvider;
    }
}
