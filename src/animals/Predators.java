package animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String food;

    public Predators(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed);
        if (food == null) {
            this.food = "default";
        } else {
            this.food = food;
        }
    }

    public void hunt() {
        System.out.println("Я охочусь!");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return food.equals(predators.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + ", мне " + getAge() + " лет, я живу в " + getLivingEnvironment() +
                ", моя скорость " + getSpeed() + ", я кушаю " + food;
    }
}
