package animals;

import java.util.Objects;

public class Mammals  extends Animals{

    private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        if (livingEnvironment == null) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (speed <= 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public void eat() {
        System.out.println("Я пью молоко!");
    }

    @Override
    public void go() {
        System.out.println("Я передвигаюсь по земле!");
    }

    public void walk() {
        System.out.println("Я гуляю!");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + ", мне " + getName() + " лет, я живу в " + livingEnvironment +
                ", моя скорость " + speed;
    }
}
