package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println("--------------------");
        System.out.printf("Tamanho da lista original: %d\n", list.size());
        showList(list);

        System.out.println("--------------------");
        System.out.println("Removendo pessoas com inicial 'M'");
        list.removeIf(x -> x.charAt(0) == 'M');
        showList(list);

        System.out.println("--------------------");
        System.out.println("Verificando indices de pessoas da lista");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------");
        System.out.println("Filtrando a lista de pessoas com inicial A");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        showList(result);

        System.out.println("--------------------");
        System.out.println("Acessando primeiro item da lista que começa com A");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst()
                .orElse(null);
        System.out.println(name);
    }

    public static void showList(List<String> list) {
        for (String name: list) {
            System.out.println(name);
        }
    }
}