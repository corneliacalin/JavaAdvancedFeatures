package oop.collection.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Brasov");
        countries.add("Maramures");
        countries.add("Cluj");
        System.out.println(countries.indexOf("Cluj"));
        System.out.println(countries.size());
   //     countries.remove(0);
        System.out.println(countries.remove("Brasov"));
        System.out.println("after remove");
        System.out.println(countries.size());

        System.out.println("****1");
        System.out.println(countries);
        System.out.println("****2");
        for (int i=0; i<countries.size();i++){
            System.out.println(countries.get(i));

        }
        System.out.println("****3");
        for (String country: countries) {
            System.out.println(country);
        }
        System.out.println("****4");
        countries.forEach(System.out::println);
        System.out.println("*****5");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
