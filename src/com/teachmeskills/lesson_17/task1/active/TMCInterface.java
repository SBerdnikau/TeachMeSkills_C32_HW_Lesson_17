package com.teachmeskills.lesson_17.task1.active;

import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;

@FunctionalInterface
public interface TMCInterface<T>{
    T func(T t) throws WrongInvalidOperation;
}
