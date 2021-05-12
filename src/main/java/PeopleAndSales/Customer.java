package PeopleAndSales;

import HelicopterBuild.Helicopter;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Helicopter> collectionOFHelicopters;

    public Customer(double money) {
        this.money = money;
        collectionOFHelicopters = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Helicopter> getCollectionOFHelicopters() {
        return collectionOFHelicopters;
    }

    public void setCollectionOFHelicopters(ArrayList<Helicopter> collectionOFHelicopters) {
        this.collectionOFHelicopters = collectionOFHelicopters;
    }

    public void addHelicopter(Helicopter heli){
        this.collectionOFHelicopters.add(heli);
    }

}

//  have money and a collection of owned vehicles.