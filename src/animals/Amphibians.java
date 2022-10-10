package animals;

import java.util.Objects;

public class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю!");
    }

    @Override
    public void go() {
        System.out.println("Я передвигаюсь по земле и воде!");
    }

    public void hunt() {
        System.out.println("Я охочусь!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + ", мне " + getName() + " лет, я живу в " + livingEnvironment;
    }
}
