package PeopleAndSales;

import HelicopterBuild.Helicopter;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Helicopter> helicopters;
    private double till;

    public Dealership(double till) {
        helicopters = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(ArrayList<Helicopter> helicopters) {
        this.helicopters = helicopters;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addHelicopter(Helicopter heli){
        this.helicopters.add(heli);
    }

}

//  stock of different types of Helis and a till.
