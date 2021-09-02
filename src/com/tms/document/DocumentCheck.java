package com.tms.document;

/**
 *  В методе класса, в котором будут вызываться эти методы для демонстрации работы (содержит abc, начинается с 555, заканчивается на 1a2b),
 *  перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 *
 *  Задание для доработки скопировано из TMS_Lesson_4_HW, package com.tms.hw00, задание 0.
 */

public class DocumentCheck {

    // Вывести на экран в одну строку два первых блока по 4 цифры
    public static void twoFirstNumberBlocks(String invoiceNumber) {
        String[] arrayInvoiceNumber = invoiceNumber.split("-");
        System.out.println(arrayInvoiceNumber[0] + " " + arrayInvoiceNumber[2]);
    }

    // Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
    // Заменяю два блока из трех букв на три пробела:
    public static void invoiceNumberWithoutTwoLetterBlocks(String invoiceNumber) {
        String[] arrayInvoiceNumber = invoiceNumber.split("-");
        arrayInvoiceNumber[1] = "   ";
        arrayInvoiceNumber[3] = "   ";
        String result = String.join("-", arrayInvoiceNumber[0], arrayInvoiceNumber[1], arrayInvoiceNumber[2], arrayInvoiceNumber[3], arrayInvoiceNumber[4]);
        System.out.println(result);
    }

    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static void lettersFromInvoiceNumber(String invoiceNumber) {
        String[] arrayInvoiceNumber = invoiceNumber.split("-");
        String str1 = new String(arrayInvoiceNumber[1]); // Нужные массивы с буквами перевожу обратно в строку
        String str2 = new String(arrayInvoiceNumber[3]);
        String str = new String(arrayInvoiceNumber[4]);
        // Извлекаю символы из последнего блока и записываю в переменные:
        char str3 = str.charAt(1);
        char str4 = str.charAt(3);
        String result = String.join("/", str1, str2, String.valueOf(str3), String.valueOf(str4));
        System.out.println(result.toLowerCase());
    }

    // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    // класса StringBuilder)
    public static void lettersFromInvoiceNumberUpperCase (String invoiceNumber) {
        // Создаём объект:
        StringBuilder sb = new StringBuilder();
        sb.append("Letters: ");
        // Далее доавляем информацию в строку, в верхнем регистре
        sb.append(invoiceNumber.substring(5, 8).toUpperCase() +"/");
        sb.append(invoiceNumber.substring(14, 17).toUpperCase()+"/");
        sb.append(String.valueOf(invoiceNumber.charAt(19)).toUpperCase()+"/");
        sb.append(String.valueOf(invoiceNumber.charAt(21)).toUpperCase());
        System.out.println(sb);
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC
    //считается одинаковой последовательностью).
    public static void findABC(String invoiceNumber) throws ContainsAbcException {
        String numberForSearching = invoiceNumber.toLowerCase();
        int abcLocation = numberForSearching.indexOf("abc");
        if (abcLocation >= 0) {
            System.out.println("Строка содержит последовательность \"abc\"");
        } else {
            throw new ContainsAbcException(invoiceNumber, "Строка не содержит последовательность \"abc\"");
        }
    }

    // Проверить начинается ли номер документа с последовательности 555.
    public static void ifBeginsWith555(String invoiceNumber) throws BeginsWith555Exception {
        if (invoiceNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с \"555\"");
        } else {
            throw new BeginsWith555Exception(invoiceNumber, "Номер документа не начинается с \"555\"");
        }
    }

    // Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void ifEndsWith1a2b(String invoiceNumber) throws EndsWith1a2bException {
        if (invoiceNumber.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на \"1a2b\"");
        } else {
            throw new EndsWith1a2bException(invoiceNumber, "Номер документа не заканчивается на \"1a2b\"");
        }
    }
}