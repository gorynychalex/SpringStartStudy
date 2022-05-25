package ru.javalang;

public class MessageProvider implements MessageProviderIf{
    @Override
    public String getMessage() {
        return "Привет!";
    }
}
