package com.marcos1228.classstring;

import java.util.function.ToDoubleBiFunction;

public class ClassString {
    public static void main(String[] args) {
        //string em java é um conjunto de caracteres.
        //funções/métodos de string
        contains();
        equals();
        equalsIgnoreCase();

    }

    private static void contains() {
        // TODO
        // O método contains da classe String em
        // Java verifica se uma determinada sequência de
        // caracteres está presente dentro da string.
        String text1 = "Eu sou vencedor da copa do mundo";
        System.out.println(text1.contains("Eu"));
    }

    private static void equals() {
        // TODO
        // equals(String anotherString): Compara duas strings considerando maiúsculas e minúsculas.
        String s1 = "java";
        String s2 = "Java";
        System.out.println(s1.equals(s2)); // false
    }

    private static void equalsIgnoreCase() {
        // TODO
        // equalsIgnoreCase(String anotherString): Compara duas strings ignorando maiúsculas e minúsculas.
        String s1 = "java";
        String s2 = "Java";
        System.out.println(s1.equalsIgnoreCase(s2)); // false
    }
}
