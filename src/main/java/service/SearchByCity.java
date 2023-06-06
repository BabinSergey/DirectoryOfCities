package service;

import model.City;

import java.text.DecimalFormat;
import java.util.List;

public class SearchByCity {

    // поиск города с наибольшим количеством жителей
    private static void searchMoreResidents(List<City> city) {
        City[] arr = city.toArray(new City[0]);

        int max = arr[0].getPopulation();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPopulation() > max) {
                max = arr[i].getPopulation();
                index = i;
            }
        }

        System.out.println("[" + index + "]" + " = " + (new DecimalFormat("###,###").format(max)));

    }

    public static void moreResidents(List<City> city) {
        searchMoreResidents(city);
    }
}
