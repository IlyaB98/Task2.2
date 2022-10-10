package transport;

public class Train extends Transport {
    private double price;
    private double travelTime;
    private String departureStations;
    private String finalStop;
    private int numberWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 double price, double travelTime, String departureStations, String finalStop, int numberWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (travelTime < 0) {
            this.travelTime = 0.0;
        } else {
            this.travelTime = travelTime;
        }

        if (departureStations == null) {
            this.departureStations = "default";
        } else {
            this.departureStations = departureStations;
        }

        if (finalStop == null) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }

        if (numberWagons <= 0) {
            this.numberWagons = 1;
        } else {
            this.numberWagons = numberWagons;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public void setDepartureStations(String departureStations) {
        this.departureStations = departureStations;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }


    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", сборка в " + getProductionCountry() + " в " + getProductionYear() +
                " году, " + getColor() + " цвет, максимальная скорость  " + getMaxSpeed() + ", цена поездки  " +
                price + " рублей, время поездки " + travelTime + ", станция отправления " + departureStations +
                ", конечная станция " + finalStop + ", количество вагонов " + numberWagons;
    }
}
