package ru.mirea.gibo01.pr8;

import java.util.Date;

public class Cat extends Pet {
    private Date lastMeowDate;
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lastMeowDate=" + lastMeowDate +
                '}';
    }
    @Override
    public String getType() {
        return "This is Cat";
    }
    public String meow() {
        lastMeowDate = new Date();
        return "Meow";
    }
}