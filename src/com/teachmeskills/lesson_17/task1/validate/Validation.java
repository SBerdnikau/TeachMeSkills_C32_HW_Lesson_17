package com.teachmeskills.lesson_17.task1.validate;

import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;

public class Validation {
    public static void validateNumber(String number) throws WrongInvalidOperation {
        if (number.isEmpty() || number == null){
            throw new WrongInvalidOperation("Nothing passed to parameter", 200);
        }

        if (number.contains(" ")){
            throw new WrongInvalidOperation("A string with a space was passed", 300);
        }

        if (number.matches("^[a-zA-Z]+$")){
            throw new WrongInvalidOperation("A string was passed, not in numeric form.", 400);
        }
    }
}
