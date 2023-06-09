package main;

import model.City;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static service.SearchByCity.moreResidents;
import static service.SearchCityByRegion.citiesRegion;
import static service.SortingCities.typeCity;
import static service.SortingCities.typeDistrict;


public class Main {
    public static void main(String[] args) throws IOException {

        List<City> city = new ArrayList<>();

        Scanner sc = new Scanner(new File("src/main/resources/file/directory.csv"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            Scanner rsc = new Scanner(line);
            String[] value = rsc.nextLine().split(";", 6);

            City ct = new City();
            ct.setName(value[1]);
            ct.setRegion(value[2]);
            ct.setDistrict(value[3]);
            ct.setPopulation(Integer.parseInt(value[4]));
            ct.setFoundation(value[5]);

            city.add(ct);

        // Выводим в консоль объеты
//            System.out.println(ct);
        }
        sc.close();


        // Выводим в консоль отсортированные по городам
//        typeCity(city);


        // Выводим в консоль отсортированные по округам и городам
//        typeDistrict(city);

        // Выводим в консоль город с наибольшим количеством жителей
//        moreResidents(city);

        // Выводим в консоль количество городов в регионе
        citiesRegion(city);

    }
}