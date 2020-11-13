package Plane;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean isMil;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
             return model;

    }

    public void setModel(String model) {
        this.model = model;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public boolean isMil() {
        return isMil;
    }

    public void setMil(boolean mil) {
        isMil = mil;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Plane(String model, String country, int year, double hours, boolean isMil, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMil = isMil;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Plane Info: " +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", hours=" + hours +
                ", isMil=" + isMil +
                ", weight=" + weight +
                ", wingspan=" + wingspan +
                ", topSpeed=" + topSpeed +
                ", seats=" + seats +
                ", cost=" + cost +
                '}';
    }
}
