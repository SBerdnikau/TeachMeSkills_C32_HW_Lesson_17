package com.teachmeskills.lesson_17.task2;

import com.teachmeskills.lesson_17.task2.utils.TMCInterface;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *  Задача 2 (опционально)
 *  Получить день недели по дате
 */
public class ApplicationRunner {
    public static void main(String[] args) {

        TMCInterface tmcInterface = () -> {
            LocalDate localDate = LocalDate.now();
            Locale localeEn = new Locale("en");
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();

            return dayOfWeek.getDisplayName(TextStyle.FULL, localeEn);
        };

        System.out.println(tmcInterface.day());
    }
}
