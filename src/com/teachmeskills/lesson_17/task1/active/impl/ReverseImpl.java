package com.teachmeskills.lesson_17.task1.active.impl;

import com.teachmeskills.lesson_17.task1.active.TMCInterface;
import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;

public class ReverseImpl {
    public static void reverse(String data) throws WrongInvalidOperation {
        TMCInterface<String> reverse = (str) -> {
            StringBuilder stringBuilder = new StringBuilder().append(str);
            stringBuilder.reverse();
            return stringBuilder.toString();
        };

        System.out.println("Reverse: " + reverse.func(data));
    }
}