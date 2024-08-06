package com.smart;

import java.util.List;

public class TwoWheelerParkingSpotManager  extends  ParkingSpotManager{


    ParkingStrategy parkingStrategy;
    List<ParkinSpot> twoWheelerSpotList;
    public TwoWheelerParkingSpotManager(List<ParkinSpot> parkinSpotList, ParkingStrategy parkingStrategy) {
        super(parkinSpotList, parkingStrategy);
    }

    @Override
    ParkinSpot findParkingSpot() {
        return parkingStrategy.findSpot(twoWheelerSpotList);
    }
}
