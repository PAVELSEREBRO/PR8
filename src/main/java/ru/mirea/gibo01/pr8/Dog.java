package  ru.mirea.gibo01.pr8;

import java.util.Date;

public class Dog extends Pet {
    private Date lastGavDate;
    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(String name) {super(name);}

    @Override
    public String toString() {
        return "Dog{" +
                "lastGavDate=" + lastGavDate +
                '}';
    }
    @Override
    public String getType() {
        return "This is Dog";
    }
    public String Gav() {
        lastGavDate = new Date();
        return Gav();
    }
}