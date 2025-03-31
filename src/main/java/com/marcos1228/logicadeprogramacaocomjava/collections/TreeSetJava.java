package com.marcos1228.logicadeprogramacaocomjava.collections;

import java.util.TreeSet;

public class TreeSetJava {

//    TreeSet em
//    Java
//    A classe
//    TreeSet faz
//    parte do
//    Java Collections
//    Framework e
//    implementa a
//
//    interface NavigableSet,que estende SortedSet.
//    Sua principal
//    característica é
//    que os
//    elementos são
//    armazenados em
//    ordem crescente
//    automaticamente .

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        // Adicionando elementos
        numeros.add(50);
        numeros.add(10);
        numeros.add(40);
        numeros.add(30);
        numeros.add(20);

        System.out.println(numeros); // [10, 20, 30, 40, 50] - Ordenado automaticamente

        // Menor e maior elemento
        System.out.println("Menor: " + numeros.first()); // 10
        System.out.println("Maior: " + numeros.last());  // 50

        // Removendo um elemento
        numeros.remove(30);

        // Iterando sobre o conjunto ordenado
        for (Integer num : numeros) {
            System.out.println(num);
        }

        // Verificando se um elemento existe
        System.out.println(numeros.contains(40)); // true
    }
}
