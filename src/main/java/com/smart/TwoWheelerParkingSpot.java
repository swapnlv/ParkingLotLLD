package com.smart;

public class TwoWheelerParkingSpot extends ParkinSpot{

    public TwoWheelerParkingSpot(int spotID, Vehicle vehicle, boolean isEmpty, float price) {
        super(spotID, vehicle, isEmpty, price);
    }

    @Override
    public float parkingPrice() {
        return 20;
    }
}
