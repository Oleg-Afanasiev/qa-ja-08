package com.academy.lesson08.exception.ht;

import com.academy.lesson04.hometask.Date;

public class CorrectDate extends Date {

    public CorrectDate(int day, int month, int year) throws IllegalDateException {
        super(day, month, year);
    }
}
