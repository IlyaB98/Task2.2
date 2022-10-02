package task1;

import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth < 0 || yearOfBirth == null) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public void greeting() {
        if (yearOfBirth == 0) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                    ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                    ". Я родился в " + (LocalDate.now().getYear() - yearOfBirth) + " году. Я работаю на должности " +  job + ". Будем знакомы!");
        }
    }
}
