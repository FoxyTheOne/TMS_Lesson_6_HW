package com.tms.verification;

/**
 * 1. Создать класс, в котором будет статический метод.
 * (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 */

public class Verification {
    public static boolean userVerification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int counterTrue = 0;

        // Если login не соответствует требованиям, необходимо выбросить WrongLoginException
        // Длина login должна быть меньше 20 символов:
        if (login.length() > 20) {
            System.out.println();
            throw new WrongLoginException("false, введенный login содержит более 20 символов");
        }
        // login не должен содержать пробелы:
        int spaceLocation = login.indexOf(" ");
        if (spaceLocation >= 0) {
            System.out.println();
            throw new WrongLoginException("false, введенный login содержит пробелы");
        }
        System.out.println("login checked");
        counterTrue += 1;

        // Если password не соответствует требованиям, необходимо выбросить WrongPasswordException
        // Длина password должна быть меньше 20 символов:
        if (password.length() > 20) {
            System.out.println();
            throw new WrongPasswordException("false, введенный password содержит более 20 символов");
        }
        // password не должен содержать пробелы:
        spaceLocation = password.indexOf(" ");
        if (spaceLocation >= 0) {
            System.out.println();
            throw new WrongPasswordException("false, введенный password содержит пробелы");
        }
        // password должен содержать хотя бы одну цифру
        // Для проверки на наличие цифр, разбиваем строку на массив char и проверяем каждый char, является ли он цифрой:
        char ch;
        int countNumbers = 0;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                countNumbers++;
            }
        }
        if (countNumbers == 0) {
            System.out.println();
            throw new WrongPasswordException("false, введенный password не содержит ни одной цифры");
        }
        System.out.println("password checked");
        counterTrue += 1;

        // Также password и confirmPassword должны быть равны (большая и маленькая буквы в пароле - разные символы, поэтому к одному регистру не приводим):
        if (password.equals(confirmPassword)) {
            System.out.println("password = confirm password checked");
            counterTrue += 1;
        } else {
            System.out.println();
            System.out.println("password и confirm password не совпадают");
        }

        // Метод возвращает true, если значения верны или false в другом случае
        if (counterTrue == 3) {
            System.out.println();
            return true;
        } else {
            return false;
        }
    }
}
