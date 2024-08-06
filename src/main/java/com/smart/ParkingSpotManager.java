package com.smart;

import java.util.List;

public abstract class ParkingSpotManager {

    List<ParkinSpot> parkinSpotList;
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkinSpot> parkinSpotList, ParkingStrategy parkingStrategy) {
        this.parkinSpotList = parkinSpotList;
        this.parkingStrategy=parkingStrategy;
    }

    abstract ParkinSpot findParkingSpot();

    public void addVehicle(Vehicle v) {
        ParkinSpot spot = findParkingSpot();
        spot.parkVehicle(v);
    }

    public void removeVehicle(Vehicle v) {
        for (ParkinSpot spot : parkinSpotList) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle(v);
                break;
            }
        }
    }
}
