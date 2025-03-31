package com.marcos1228.logicadeprogramacaocomjava.polimorfismo;

public class MetodosToString {
    public static void main(String[] args) {
        String primeira = "java";
        String segunda = "  C##";

        //Instancie um objeto
        String terceira = new String("Python");

        System.out.println("Primeira variavel " + primeira.toUpperCase());
        System.out.println("Primeira variavel " + segunda.trim());
        System.out.println(terceira);

        boolean equals = primeira.equals(segunda);

        System.out.println("Qual é o resultado = " + equals);

    }
}
