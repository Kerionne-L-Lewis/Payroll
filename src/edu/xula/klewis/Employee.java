package edu.xula.klewis;

public class Employee {


    private String name;
    private int id;
    private double rate;
    private int maxHours;

    public Employee() {
        name= "Keri";
        id=5698;
        rate=12;
        maxHours=20;
    }

    public Employee(String name, int id, double rate, int maxHours) {
        this.name = name;
        this.id = id;
        this.rate = rate;
        this.maxHours = maxHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }

    @Override
    public String toString() {
        return name + '\t' +
                 + id + "\t$"
                 + rate + "\t"
                 + maxHours ;
    }
    public double maxPay(){
        return maxHours*rate;
    }
}
