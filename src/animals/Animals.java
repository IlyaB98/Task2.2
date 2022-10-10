package animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null) {
            this.name = "Животное";
        } else {
            this.name = name;
        }

        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public abstract void eat();
    public abstract void go();

    public void sleep() {
        System.out.println("Я сплю!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ", мне " + age + " лет.";
    }
}
