package com.smart;

public abstract class ParkinSpot {


    int spotID;
    Vehicle vehicle;
    boolean isEmpty;
    float price;

    public ParkinSpot(int spotID, Vehicle vehicle, boolean isEmpty, float price) {
        this.spotID = spotID;
        this.vehicle = vehicle;
        this.isEmpty = isEmpty;
        this.price = price;
    }

    public int getSpotID() {
        return spotID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public float getPrice() {
        return price;
    }

    public void setSpotID(int spotID) {
        this.spotID = spotID;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void parkVehicle(Vehicle v){
        this.vehicle=v;
    }

    public void removeVehicle(Vehicle v){
        this.vehicle=null;
    }

    public abstract float parkingPrice();
}