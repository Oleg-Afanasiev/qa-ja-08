package com.academy.lesson06;

public class Person {
    protected long id;
    protected String name;
    protected Gender gender;

    public Person() {
    }

    public Person(long id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void doCommonJob(String typeOfJob) {
        System.out.println("Я делаю " + typeOfJob);
    }

    public void about() {
        System.out.println("Я человек");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
