package main;

import model.City;

import java.io.File;
import java.io.IOException;
import java.util.*;


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

        // Выводим в консоль наши объеты
            System.out.println(ct);
        }
        sc.close();

        // Визуально разграничиваем от следующего блока
        System.out.println("-------------------------------");
        System.out.println();

        // Сортируем по имени города

        Collections.sort(city, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int result = o1.getName().compareTo(o2.getName());
                return result;
            }
        });

        // Выводим в консоль объекты отсортированные по алфовиту
        for (City ct : city) {
            System.out.println(ct);
        }
    }
}