package com.tms.verification;

/**
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
 * один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 */

public class WrongLoginException extends RuntimeException {
    public WrongLoginException () {
        //empty
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException {"
                + " message: " + getMessage()
                + ". Напоминаем: длина login должна быть менее 20 символов, а также login не должен содержать пробелы } ";
    }
}
