import task1.Human;
import task2.Car;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-5, "Максим", null, "бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");

        maksim.greeting();
        anya.greeting();
        katya.greeting();
        artem.greeting();

        System.out.println();

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}