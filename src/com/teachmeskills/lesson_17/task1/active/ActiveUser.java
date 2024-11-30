package com.teachmeskills.lesson_17.task1.active;

import com.teachmeskills.lesson_17.task1.active.impl.FactorialImpl;
import com.teachmeskills.lesson_17.task1.active.impl.ReverseImpl;
import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;
import com.teachmeskills.lesson_17.task1.validate.Validation;

public class ActiveUser {
    public static void activeTask(String taskNumber, String data) throws WrongInvalidOperation {
        switch (taskNumber){
             case "1" -> ReverseImpl.reverse(data);
             case "2" -> FactorialImpl.factorial(data);
             default -> throw new WrongInvalidOperation("The task number is not selected correctly.", 100);
        }
    }
}