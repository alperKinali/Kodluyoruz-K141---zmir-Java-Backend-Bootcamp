package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // bu çok iyi bir kullanım değil

        // bu daha iyi bir yöntem.
        List<String> bikes = new ArrayList<>();

        System.out.println("-----");
        cars.forEach(System.out::println);

        cars.sort(Comparator.naturalOrder());


    }
}
