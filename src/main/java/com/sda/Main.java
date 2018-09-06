package com.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Weather> weatherList = new ArrayList<Weather>();

        Weather weather = new Weather("Torun", "www", 40, 60,
                "Slonecznie", 54.54, 21.23);
        Weather weather1 = new Weather("Bydgoszcz", "www", 32, 38,
                "Slonecznie", 16.13, 15.12);
        Weather weather2 = new Weather("Warszawa", "www", 21, 24,
                "Pochmurnie", 45.65, 54.53);
        weatherList.add(weather);
        weatherList.add(weather1);
        weatherList.add(weather2);

        ObjectMapper objectMapper = new ObjectMapper();
        File filename = new File("weather.json");
        try {
            objectMapper.writeValue(filename, weather);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
