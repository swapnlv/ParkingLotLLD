package com.smart;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    ParkingStrategy parkingStrategy;
    List<ParkinSpot> fourWheelerSpotList;

    public FourWheelerParkingSpotManager(List<ParkinSpot> parkinSpotList, ParkingStrategy parkingStrategy) {
        super(parkinSpotList, parkingStrategy);
        this.parkingStrategy = parkingStrategy;
        this.fourWheelerSpotList = parkinSpotList;
    }



    @Override
    ParkinSpot findParkingSpot( ) {
        return parkingStrategy.findSpot(fourWheelerSpotList);
    }
}
