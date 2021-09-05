package com.tms.exception;

/**
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
 * один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 */

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        //empty
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException {"
                + " message: " + getMessage()
                + ". Напоминаем: длина password должна быть менее 20 символов, а также password не должен содержать пробелы и должен содержать хотя бы одну цифру } ";
    }
}
