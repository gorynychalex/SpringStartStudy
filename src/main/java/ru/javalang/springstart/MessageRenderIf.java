package ru.javalang.springstart;

/**
 * Рендеринг сообщений
 */
public interface MessageRenderIf {
    void render();
    void setMessageProvider(MessageProviderIf messageProviderIf);
    MessageProviderIf getMessageProvider();
}
