package com.teachmeskills.lesson_17.task1.exception;

public class WrongInvalidOperation extends Exception {

    private int codeError;

    public WrongInvalidOperation(String message, int codeError) {
        super(message);
        this.codeError = codeError;
    }

    public WrongInvalidOperation(String message) {
        super(message);
    }

    public int getCodeError() {
        return codeError;
    }
}
