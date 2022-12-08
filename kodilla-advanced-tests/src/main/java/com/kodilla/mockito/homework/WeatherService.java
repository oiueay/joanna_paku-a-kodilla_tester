package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class WeatherService {

    Map<Client, Location> clientLocationMap = new HashMap<>();

    public void assignLocationToSubscriber(Client client, Location location) {
        this.clientLocationMap.put(client,location);
    }

    public void sendWeatherNotification(WeatherNotification weatherNotification) {

    }
}
