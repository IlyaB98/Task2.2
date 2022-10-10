import animals.*;
import task1.Flower;
import task1.Human;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-5, "Максим", null, "бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(21, "Владимир", "Квзвнь", "безработный");

//        maksim.greeting();
//        anya.greeting();
//        katya.greeting();
//        artem.greeting();
//        vladimir.greeting();

        System.out.println();

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 200, 2015,
                "Россия", "механическая", "седан", "А547BE750",
                4, "летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 250, 2020,
                "Германия", "автоматическая", "седан", "А446BE750",
                4, "летняя");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 220, 2021,
                "Германия", "автоматическая", "родстер", "А235BE750",
                4, "летняя");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 200, 2018,
                "Южная Корея", "автоматическая", "кроссовер", "А346BE750",
                4, "летняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 210, 2016,
                "Южная Корея", "автоматическая", "седан", "А856BE750",
                4, "летняя");

//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        tireReplacement(hyundai);
//        System.out.println(hyundai);
//
//        System.out.println();

        Flower rose = new Flower("Роза", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", 15.0, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

//        System.out.println(rose);
////        System.out.println(chrysanthemum);
////        System.out.println(pion);
////        System.out.println(gypsophila);
//
//        Flower[] flowers = new Flower[4];
//        flowers[0] = rose;
//        flowers[1] = chrysanthemum;
//        flowers[2] = pion;
//        flowers[3] = gypsophila;
//        theCostOfTheBouquet(flowers);

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, 3500, 0, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, 0, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);

//        System.out.println(lastochka);
//        System.out.println(leningrad);

        Bus bus1 = new Bus("Автобус-1", "A1", 2020, "Россия", "Желтый", 90);
        Bus bus2 = new Bus("Автобус-2", "A2", 2021, "Россия", "Красный", 90);
        Bus bus3 = new Bus("Автобус-3", "A3", 2016, "Россия", "Голубой", 80);

//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);

//        lada.refill();
//        lastochka.refill();
//        bus1.refill();

        Herbivores gazelle = new Herbivores("Газель", 5, "Африка", 40, "Трава");
        System.out.println(gazelle);
        Herbivores giraffe = new Herbivores("Жираф", 3, "Африка", 25, "Трава");
        Herbivores horse = new Herbivores("Лошадь", 7, "Россия", 70, "Трава");

        Predators hyena = new Predators("Гиена", 3, "Африка", 40, "Мясо");
        Predators tiger = new Predators("Тигр", 10, "Африка", 50, "Мясо");
        Predators bear = new Predators("Медведь", 12, "Россия", 35, "Мясо");

        Amphibians frog = new Amphibians("Лягушка", 2, "Россия");
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "Россия");

        Flightless peacock = new Flightless("Павлин", 3, "Россия", "Ходьба");
        Flightless penguin = new Flightless("Пингвин", 4, "Антарктида", "Ходьба");
        Flightless dodo = new Flightless("Птица Додо", 2, "Мадагаскар", "Ходьба");

        Flying seagull = new Flying("Чайка", 2, "Россия", "Летает");
        Flying albatross = new Flying("Альбатрос", 2, "Антарктиды", "Летает");
        Flying falcon = new Flying("Сокол", 3, "Россия", "Летает");

    }

    public static void theCostOfTheBouquet(Flower[] flowers) {
        Flower[] flowers1 = new Flower[1000];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Какой цветок добавить в букет?");
            System.out.println("1 - Роза");
            System.out.println("2 - Хризантема");
            System.out.println("3 - Пион ");
            System.out.println("4 - Гипсофила");
            int answer = scanner.nextInt();
            System.out.println("Сколько штук добавить в букет?");
            int answer1 = scanner.nextInt();
            for (int j = 0; j < answer1; j++) {
                for (int i = 0; i < flowers1.length; i++) {
                    if (flowers1[i] == null) {
                        flowers1[i] = flowers[answer - 1];
                        break;
                    }
                }
            }

            System.out.println("Добавить еще цветок в букет?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int answer2 = scanner.nextInt();
            if (answer2 == 2) {
                System.out.println("Состав букета:");
                for (int i = 0; i < flowers1.length - 1; i++) {
                    if (flowers1[i] == null) {
                        break;
                    }
                    System.out.println(flowers1[i].getName());
                }
                double price = 0;
                for (int i = 0; i < flowers1.length - 1; i++) {
                    if (flowers1[i] == null) {
                        break;
                    }
                    price += flowers1[i].getCost();
                }
                price += price * 0.1;
                System.out.printf("Стоимость букета = %.2f", price);

                int lifeSpan = flowers1[0].getLifeSpan();
                for (int i = 0; i < flowers1.length - 1; i++) {
                    if (flowers1[i] == null) {
                        break;
                    }
                    if (lifeSpan > flowers1[i].getLifeSpan()) {
                        lifeSpan = flowers1[i].getLifeSpan();
                    }
                }
                System.out.println();
                System.out.println("Срок стояния букета = " + lifeSpan);
                break;
            }
        }
    }

    public static void tireReplacement(Car car) {
        if (LocalDate.now().getMonthValue() == 12 || LocalDate.now().getMonthValue() == 1 ||
                LocalDate.now().getMonthValue() == 2) {
            car.setTires("зимняя");
        }
    }
}
