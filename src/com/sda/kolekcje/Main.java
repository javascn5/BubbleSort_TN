package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {
        // sortowanie babelkowe- 21.10.18

        int tab[] = {1, 33, 32, 5, 12, 45, 342, -5, 32};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // tworzymy 2 petle
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                // jesli j bedzie wieksze od j+1, to niech wstawi j w miejscei j+1
                // dodana zmienna pomocnicza tmp
                if (tab[j] < tab[j + 1]) {
                    int tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }
            System.out.println("==============");
            for (int k = 0; k < tab.length - 1; k++) {
                System.out.println(tab[k]);
            }
        }
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
