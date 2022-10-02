package transport;

import java.time.LocalDate;

public class Car {

    private static class Key{
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null) {
                this.remoteEngineStart = "нет";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null) {
                this.keylessAccess = "нет";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }
    }

    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final double costInsurance;
        private final String insuranceNumber;

        public Insurance(LocalDate insuranceValidityPeriod, double costInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            if (insuranceValidityPeriod.isBefore(LocalDate.now())) {
                System.out.println("Нужно оформить страховку!");
            }

            if (insuranceNumber.length() < 9) {
                System.out.println("Номер страховки не правильный!");
            }
            this.costInsurance = costInsurance;
            this.insuranceNumber = insuranceNumber;
        }

    }
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Неверный формат номера";
        }

        if (numberOfSeats <= 1) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (tires == null) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", сборка в " + productionCountry + " в " + productionYear + " году, " + color +
                " цвет кузова, объем – " + engineVolume + ", коробка передач " + transmission + ", тип кузова "
                + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест " + numberOfSeats
                + ", резина " + tires;
    }
}
