package oop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Andrei", "Ion", "Maria");
        Stream<String> nameStream = names.stream();

        List<String> namesCopy = names.stream().collect(Collectors.toList());
        System.out.println(namesCopy);

        Optional<String> firstName = names.stream().findFirst();
        if(firstName.isPresent()){
            System.out.println(firstName.get());
        }

        List<String> nameStartingWithI= names.stream() // sau name.parallelStream()
                .filter(element-> element.startsWith("I"))
                .collect(Collectors.toList());
        System.out.println(nameStartingWithI);

        List<Integer> wordSize = names.stream()
                .filter(element-> element.endsWith("a"))
                .map(String::length)    //mapam Stringul cu lungimea
                .collect(Collectors.toList());
        System.out.println(wordSize);

        names.stream().forEach(element-> System.out.println(element));



    }
}
