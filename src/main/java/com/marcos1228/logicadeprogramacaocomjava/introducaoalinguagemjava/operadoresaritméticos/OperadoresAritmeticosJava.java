package com.marcos1228.logicadeprogramacaocomjava.introducaoalinguagemjava.operadoresaritméticos;

public class OperadoresAritmeticosJava {
    public static void main(String[] args) {
        int a = 10, b = 3;


        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    private static int soma(int a, int b){
        System.out.println("Soma: " + (a + b));
        return a + b;
    }
}
