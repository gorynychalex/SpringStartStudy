package ru.javalang;

/**
 * Рендеринг сообщений
 */
public interface MessageRenderIf {
    void render();
    void setMessageProvider(MessageProviderIf messageProviderIf);
    MessageProviderIf getMessageProvider();
}
