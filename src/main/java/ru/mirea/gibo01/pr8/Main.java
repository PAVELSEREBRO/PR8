package ru.mirea.gibo01.pr8;

public class Main {
    public static void main(String[] args) {


        Pet pet = new Pet("Барсик",12);
        Pet pet1 = new Pet("Анастас", 3);

        System.out.println(pet.getType());
        System.out.println(pet1.getType());

        Cat cat1 = new Cat("Валера" , 12);
        System.out.println(cat1.getType() + cat1.meow()+cat1.getName());

        Dog dog1 = new Dog("Арарат", 5);

        System.out.println(dog1.getType() + dog1.Gav() + dog1.getName());

    }
}