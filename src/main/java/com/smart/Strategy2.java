package com.smart;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Strategy2 extends ParkingStrategy{
    @Override
    public ParkinSpot findSpot(List<ParkinSpot> spots) {
        Collections.sort(spots, Comparator.comparingInt((ParkinSpot spot) -> spot.spotID).reversed());

        for(ParkinSpot spot:spots){
            if(spot.isEmpty){
                return spot;
            }
        }
        return null;
    }
    }
}
