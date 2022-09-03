package ru.javalang.springstart;

/**
 * Логика получения сообщения
 */

public interface MessageProviderIf {
    String getMessage();
    void setMessage(String s);
}
