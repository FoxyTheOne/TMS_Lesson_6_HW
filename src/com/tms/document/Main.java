package com.tms.document;

/**
 * 0. Добработать нулевое домашнее задание предыдущего урока.
 * Теперь надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 *
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы,
 * перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 *
 * Задание для доработки скопировано из TMS_Lesson_4_HW, package com.tms.hw00, задание 0.
 */

public class Main {
    public static void main(String[] args) {
        String invoiceNumber = "5553-mps-1361-axz-1m2abc"; // Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.

        try {
            DocumentCheck.twoFirstNumberBlocks(invoiceNumber); // Вывести на экран в одну строку два первых блока по 4 цифры
            DocumentCheck.invoiceNumberWithoutTwoLetterBlocks(invoiceNumber); // Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
            DocumentCheck.lettersFromInvoiceNumber(invoiceNumber); // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
            DocumentCheck.lettersFromInvoiceNumberUpperCase(invoiceNumber); // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
            DocumentCheck.findABC(invoiceNumber); // Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
            DocumentCheck.ifBeginsWith555(invoiceNumber); // Проверить начинается ли номер документа с последовательности 555
            DocumentCheck.ifEndsWith1a2b(invoiceNumber); // Проверить заканчивается ли номер документа на последовательность 1a2b
        } catch (ContainsAbcException | BeginsWith555Exception | EndsWith1a2bException e) {
            System.out.println("Перехвачено исключение - " + e);
            System.out.println("Завершение программы");
        }
    }
}