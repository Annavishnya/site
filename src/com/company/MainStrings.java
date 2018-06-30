package com.company;


public class MainStrings {

    public static void main(String[] args) {
        String stroka1 = "Смеркалось. Я вышел на улицу.";
        String stroka2 = "Пошел дождь, я вернулся за зонтом";

        //строка1 + строка2
        System.out.println(stroka1 + " " + stroka2);


        //распечатать количество символов в строка1 и строка2
        // Google: узнать количество символов с string (или в строке)
        System.out.println(stroka1.length());
        System.out.println(stroka2.length());


        // распечатать первые три символа от строка1
        //Google первые три символа от строки
        System.out.println(stroka1.substring(0, 3));


        // распечатать последние три символа от строка1
        System.out.println(stroka1.substring(stroka1.length() - 3));


        // распечатать часть строки1 начиная от символа '.'
        // google метод indexOf()       (у класса string)
        System.out.println(stroka1.substring(stroka1.indexOf(".")));


        // проверить что строка2 начинается с символа 'П'
        //  System.out.println(stroka2.startsWith("П"));
        System.out.println(stroka2.charAt(5) == ' ');


        // Распечатать средний символ в строка1
        //5 / 2 = результат
        System.out.println(stroka1.charAt(stroka1.length() / 2));


        String stroka3 = "19,20,21,1,2,1,0";
        //вывести числа, указанные в строке3 через запятую в столбик на экран
        //прочитать про метод split(...)

        for (String a : stroka3.split(",")) {
            System.out.println(a);
        }

        String stroka4 = "12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/12/12/1994/";
        //разбить строку по символу / и вывести на экран только строки равные "12"
        // .equals("12")
        // всё, что не int, byte, char, double, float - сравнивается через метод equals(...)
        // int, byte, char, double, float сравниваются через ==

        //продолжение:
        //в добавок последней строкой ввывести количество строк равных "12"
        int schetchik = 0;
        int schetchik2 = 0;


        //продолжение(2):
        //в добавок последней строкой ввывести количество строк равных "1994"


        //продолжение (3):
        //перестать считать, если строка b равна 1994
        // подсказка: break

        for (String b : stroka4.split("/")) {
            if (b.equals("12")) {
                //System.out.println(b);
                schetchik++;

            }
            else if (b.equals("1994"))  {
                schetchik2++;
                break;
            }

        }
        System.out.println(schetchik);
        System.out.println (schetchik2);
    }
}