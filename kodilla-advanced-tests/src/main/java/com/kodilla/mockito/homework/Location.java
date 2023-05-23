package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private List<String> locations = new ArrayList<>();

    public Location(List<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locations=" + locations +
                '}';
    }
}
