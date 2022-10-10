package transport;

import java.time.LocalDate;

public class Car extends Transport{

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

    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int maxSpeed, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных " +
                "электропарковках, если это электрокар.");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", сборка в " + getProductionCountry() + " в " + getProductionYear() +
                " году, " + getColor() + " цвет кузова, объем – " + engineVolume + ", коробка передач " + transmission +
                ", тип кузова " + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест " +
                numberOfSeats + ", резина " + tires;
    }
}
