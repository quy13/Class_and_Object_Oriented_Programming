package com.example.learnjava;

public class Person {
    String name;
    private String firstName;
    private String lastName;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age) {
        this.name = firstName;
        this.name = lastName;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
