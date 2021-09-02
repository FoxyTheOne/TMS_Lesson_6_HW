package com.tms.verification;

/**
 * 1. Создать класс, в котором будет статический метод.
 * (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 * Этот метод принимает на вход три параметра:
 *   login
 *   password
 *   confirmPassword
 * Все поля имеют тип данных String.
 *
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 *
 * Длина password должна быть меньше 20 символов, не должен содержать пробелы и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 *
 * Метод возвращает true, если значения верны или false в другом случае.
 */

public class Main {
    static String login = "bbb";
    static String password = "mmm1";
    static String confirmPassword = "mmm1";

    public static void main(String[] args) {
        try {
            System.out.println(Verification.userVerification(login, password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Перехвачено исключение - " + e);
            System.out.println("Завершение программы");
        }
    }
}
