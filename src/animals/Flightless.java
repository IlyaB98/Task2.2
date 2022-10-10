package animals;

import java.util.Objects;

public class Flightless extends Birds{

    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null) {
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void walk() {
        System.out.println("Я гуляю!");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + ", мне " + getAge() + " лет, я живу в " + getLivingEnvironment() +
                ", тип передвижения " + typeOfMovement;
    }
}
