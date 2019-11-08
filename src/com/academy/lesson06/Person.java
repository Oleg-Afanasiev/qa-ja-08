package com.academy.lesson06;

public class Person {
    protected String name;
    protected Gender gender;

    public void doCommonJob(String typeOfJob) {
        System.out.println("Я делаю " + typeOfJob);
    }

    public void about() {
        System.out.println("Я человек");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
