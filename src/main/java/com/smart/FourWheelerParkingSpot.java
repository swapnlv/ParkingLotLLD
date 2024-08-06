package com.smart;

public class FourWheelerParkingSpot extends ParkinSpot{
    public FourWheelerParkingSpot(int spotID, Vehicle vehicle, boolean isEmpty, float price) {
        super(spotID, vehicle, isEmpty, price);
    }

    @Override
    public float parkingPrice() {
        return 40;
    }
}
