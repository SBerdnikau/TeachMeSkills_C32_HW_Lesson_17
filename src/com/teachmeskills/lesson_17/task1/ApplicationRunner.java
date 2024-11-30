package com.teachmeskills.lesson_17.task1;


import com.teachmeskills.lesson_17.task1.exception.WrongInvalidOperation;
import com.teachmeskills.lesson_17.task1.active.ActiveUser;

import java.util.Scanner;

/**
 * Задача 1
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом.
 * В этом методе реализуйте логику:
 * 	- если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса
 * 	логику реверса строки(вывода строки в обратном порядке).
 * 	- если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в
 * 	метод интерфейса логику нахождения факториала числа.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        try(Scanner inputData = new Scanner(System.in)) {
            System.out.print("Enter the task number as the first parameter. 1 - Reverse, 2 - factorial of the number: " );
            String taskNumber = inputData.nextLine().trim();
            System.out.print("Enter the data for the task: ");
            String data = inputData.nextLine().trim();
            ActiveUser.activeTask(taskNumber, data);
        }catch (WrongInvalidOperation e){
            System.out.println("General exception input: " + e.getMessage() + " Code: " + e.getCodeError());
        }
    }
}