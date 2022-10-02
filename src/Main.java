import task1.Flower;
import task1.Human;
import transport.Car;

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

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015,
                "Россия", "механическая", "седан", "А547BE750",
                4, "летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "автоматическая", "седан", "А446BE750",
                4, "летняя");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия", "автоматическая", "родстер", "А235BE750",
                4, "летняя");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018,
                "Южная Корея", "автоматическая", "кроссовер", "А346BE750",
                4, "летняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "автоматическая", "седан", "А856BE750",
                4, "летняя");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        tireReplacement(hyundai);
        System.out.println(hyundai);

        System.out.println();

        Flower rose = new Flower("Роза", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", 15.0, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

//        System.out.println(rose);
//        System.out.println(chrysanthemum);
//        System.out.println(pion);
//        System.out.println(gypsophila);
//
//        Flower[] flowers = new Flower[4];
//        flowers[0] = rose;
//        flowers[1] = chrysanthemum;
//        flowers[2] = pion;
//        flowers[3] = gypsophila;
//        theCostOfTheBouquet(flowers);


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
