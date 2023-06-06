package service;

import model.City;

import java.util.List;

public class SearchCityByRegion {

    private static void numberOfCitiesRegion(List<City> city) {
        City[] arr = city.toArray(new City[0]);

        int count = 0;
        String region = arr[0].getRegion();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRegion().equals(region)) {
                count++;
            } else {
                System.out.println(region + " - " + count);
                region = arr[i].getRegion();
                count = 0;
                i--;
            }
        }
    }

    public static void citiesRegion(List<City> city) {
        numberOfCitiesRegion(city);
    }
}
