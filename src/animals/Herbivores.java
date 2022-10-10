package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String food;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed);
        if (food == null) {
            this.food = "default";
        } else {
            this.food = food;
        }
    }

    public void graze() {
        System.out.println("Я пасусь!");
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
        Herbivores that = (Herbivores) o;
        return food.equals(that.food);
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
