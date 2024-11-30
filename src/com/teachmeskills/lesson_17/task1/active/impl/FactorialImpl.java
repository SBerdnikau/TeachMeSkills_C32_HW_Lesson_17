package com.teachmeskills.lesson_17.task1.active.impl;

import com.teachmeskills.lesson_17.task1.active.TMCInterface;
import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;
import com.teachmeskills.lesson_17.task1.validate.Validation;

public class FactorialImpl {
    public static void factorial(String data) throws WrongInvalidOperation {
        TMCInterface<String> factorial =  (num) -> {
            Validation.validateNumber(num);
            int n = Integer.parseInt(num);
            int result = 1;
            for (int i = 1; i <= n; i++){
                result = i * result;
            }
            return String.valueOf(result);
        };

        System.out.println("Factorial :" + factorial.func(data));
    }
}