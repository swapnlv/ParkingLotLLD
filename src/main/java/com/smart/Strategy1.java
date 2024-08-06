package com.smart;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Strategy1 extends ParkingStrategy {


    @Override
    public ParkinSpot findSpot(List<ParkinSpot> spots) {

        Collections.sort(spots, Comparator.comparingInt(spot -> spot.spotID));
        for(ParkinSpot spot:spots){
            if(spot.isEmpty){
                return spot;
            }
        }
        return null;
    }
}
