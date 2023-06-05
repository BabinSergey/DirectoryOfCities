package service;

import model.City;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCities {

    // Сортируем по имени города без учета регистра

    private static void sortListCity(List<City> city) {
        Collections.sort(city, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int result = o1.getName().compareToIgnoreCase(o2.getName());
                return result;
            }
        });
    }

    // Выводим в консоль отсортированные по городам

    public static void typeCity(List<City> city) {
        sortListCity(city);
        for (City ct : city) {
            System.out.println(ct);
        }
    }

    // Сортируем по федеральному округу и имени города

    private static void sortListDistrict(List<City> city) {
        Collections.sort(city, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int result = o1.getDistrict().compareTo(o2.getDistrict());
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
    }

    // Выводим в консоль отсортированные по округам и городам

    public static void typeDistrict(List<City> city) {
        sortListDistrict(city);
        for (City ct : city) {
            System.out.println(ct);
        }
    }









//        for (City ct : city) {
//            System.out.println(ct);
//        }
}
